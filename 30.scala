object SumEvenNumbers {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    println(list.filter(_ % 2 == 0).sum)
  }
}
