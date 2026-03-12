object CommonElementsInt {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 3, 4, 5)
    val arr2 = Array(3, 4, 5, 6, 7)
    val common = arr1.intersect(arr2)
    println(common.mkString(", "))
  }
}
