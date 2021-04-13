package shopping.cart

import akka.NotUsed
import akka.actor.typed.{ActorSystem, DispatcherSelector}
import akka.stream.scaladsl.Source
import shopping.cart.proto.{Cart, ItemPopularity, ListItemPopularity, StreamPopularityService, TickerSymbol}
import shopping.cart.repository.{ItemPopularityRepositoryImpl, ScalikeJdbcSession, ShoppingCartServiceImpl}

import scala.concurrent.ExecutionContext
import scala.concurrent.duration.DurationInt
import scala.util.Random

//#impl
class StreamItemPopularityServiceImpl(system: ActorSystem[_], repo: ItemPopularityRepositoryImpl) extends StreamPopularityService {

  private val blockingJdbcExecutor: ExecutionContext =
    system.dispatchers.lookup(
      DispatcherSelector
        .fromConfig("akka.projection.jdbc.blocking-jdbc-dispatcher")
    )

  override def streamPopularity(in: TickerSymbol): Source[ListItemPopularity, NotUsed] = {
    Source.fromIterator(() => Iterator.continually {
      Thread.sleep(5000)
      ScalikeJdbcSession.withSession { session =>
        repo.itemWithPopularity(session)
      }
    }).mapMaterializedValue(_ => NotUsed)
  }

  override def streamItemAdded(cart: Cart): Source[Cart, NotUsed] = {
    Source.empty
  }
}

//#impl
