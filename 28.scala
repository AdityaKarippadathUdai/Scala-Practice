object DuplicateElements {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 2, 3, 4, 4, 5)
    val duplicates = list.groupBy(identity).filter(_._2.size > 1).keys
    println(duplicates.mkString(", "))
  }
}
