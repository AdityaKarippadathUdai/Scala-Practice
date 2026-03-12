object ListDifference {
  def main(args: Array[String]): Unit = {
    val list1 = List(1, 2, 3, 4, 5)
    val list2 = List(3, 4, 5, 6, 7)
    println(list1.diff(list2))
  }
}
