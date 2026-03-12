object LargerInRange {
  def main(args: Array[String]): Unit = {
    def larger(a: Int, b: Int): Int = {
      if (a >= 20 && a <= 30 && b >= 20 && b <= 30) math.max(a, b)
      else if (a >= 20 && a <= 30) a
      else if (b >= 20 && b <= 30) b
      else 0
    }
    println(larger(25, 28))
    println(larger(19, 35))
  }
}
