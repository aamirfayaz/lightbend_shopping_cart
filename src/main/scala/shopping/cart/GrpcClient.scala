/*
package shopping.cart


import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.Failure
import scala.util.Success
import akka.Done
import akka.NotUsed
import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.grpc.GrpcClientSettings
import akka.stream.scaladsl.Source
import shopping.cart.repository.{ItemPopularityRepositoryImpl, ShoppingCartServiceImpl}


object StreamGrpcClient extends App {

    implicit val sys: ActorSystem[_] = ActorSystem(Behaviors.empty, "GreeterClient")
    implicit val ec: ExecutionContext = sys.executionContext

  val client = new ShoppingCartServiceImpl(sys, new ItemPopularityRepositoryImpl())


    //#client-request-reply
    //#client-stream
      println(s"Performing streaming requests: $name")

      val requestStream: Source[HelloRequest, NotUsed] =
        Source
          .tick(1.second, 1.second, "tick")
          .zipWithIndex
          .map { case (_, i) => i }
          .map(i => HelloRequest(s"$name-$i"))
          .mapMaterializedValue(_ => NotUsed)

      val responseStream: Source[HelloReply, NotUsed] = client.streamCart(requestStream)
      val done: Future[Done] =
        responseStream.runForeach(reply => println(s"$name got streaming reply: ${reply.message}"))

      done.onComplete {
        case Success(_) =>
          println("streamingBroadcast done")
        case Failure(e) =>
          println(s"Error streamingBroadcast: $e")
      }
    }
*/
