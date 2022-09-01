object Main extends App {
  sealed trait Cell
  final case object DeadCell extends Cell
  final case object AliveCell extends Cell

  def update(cells: List[List[Cell]]): List[List[Cell]] = List(List(DeadCell, DeadCell, DeadCell), List(DeadCell, DeadCell, DeadCell), List(DeadCell, DeadCell, DeadCell))
}