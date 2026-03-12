object ListOperations {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    list.foreach(println)
    println(s"Sum: ${list.sum}, Product: ${list.product}")
  }
}
