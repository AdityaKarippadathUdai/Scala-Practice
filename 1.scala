object SumTriple {
  def main(args: Array[String]): Unit = {
    def sum(a: Int, b: Int): Int = {
      if (a == b) 3 * (a + b)
      else a + b
    }
    println(sum(10, 10))
    println(sum(5, 8))
  }
}
