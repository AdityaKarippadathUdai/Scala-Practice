object OddOccurrence {
  def findOdd(arr: Array[Int]): Int = {
    arr.reduce(_ ^ _)
  }
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 2, 3, 1, 3)
    println(findOdd(arr))
  }
}
