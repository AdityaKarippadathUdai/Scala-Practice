object CommonElementsStr {
  def main(args: Array[String]): Unit = {
    val arr1 = Array("apple", "banana", "cherry")
    val arr2 = Array("banana", "cherry", "date")
    val common = arr1.intersect(arr2)
    println(common.mkString(", "))
  }
}
