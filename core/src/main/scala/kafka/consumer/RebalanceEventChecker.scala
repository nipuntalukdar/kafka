package kafka.consumer

trait RebalanceEventChecker {
  def rebalanceReady(): Unit
  def name(): String
  override def equals(that: Any): Boolean
  override def hashCode: Int
}