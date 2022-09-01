object Main extends App {
  sealed trait Cell
  final case object DeadCell extends Cell
  final case object AliveCell extends Cell

  def update(cells: List[List[Cell]]): Cell = 
  if (cells.flatten.count(_ == AliveCell) > 2) AliveCell else DeadCell
}