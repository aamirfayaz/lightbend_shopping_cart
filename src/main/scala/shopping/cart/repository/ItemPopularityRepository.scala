package shopping.cart.repository

import shopping.cart.proto.ListItemPopularity

trait ItemPopularityRepository {
  def update(session: ScalikeJdbcSession, itemId: String, delta: Int): Unit
  def getItem(session: ScalikeJdbcSession, itemId: String): Option[Long]
  def itemWithPopularity(session: ScalikeJdbcSession): ListItemPopularity
}
