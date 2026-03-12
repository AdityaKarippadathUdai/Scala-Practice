object ClosestToZero {
  def main(args: Array[String]): Unit = {
    val arr = Array(-10, -3, 5, 9, 2)
    val sortedArr = arr.sorted
    var (minSum, num1, num2) = (Int.MaxValue, 0, 0)

    for (i <- 0 until sortedArr.length; j <- i + 1 until sortedArr.length) {
      val sum = sortedArr(i) + sortedArr(j)
      if (math.abs(sum) < minSum) {
        minSum = math.abs(sum)
        num1 = sortedArr(i)
        num2 = sortedArr(j)
      }
    }
    println(s"Elements: $num1, $num2")
  }
}
