object Diff51 {
  def main(args: Array[String]): Unit = {
    def diff(n: Int): Int = {
      if (n > 51) 3 * (n - 51)
      else 51 - n
    }
    println(diff(30))
    println(diff(60))
  }
}
