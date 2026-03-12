object RemoveElements {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val removed = list.filterNot(Set(2, 4))
    println(removed)
  }
}
