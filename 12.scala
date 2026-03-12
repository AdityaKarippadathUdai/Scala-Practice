object DuplicateCount {
  def main(args: Array[String]): Unit = {
    val str = "programming"
    val duplicates = str.groupBy(identity).filter(_._2.length > 1)
    println("Duplicates: " + duplicates.keys.mkString(", "))
  }
}
