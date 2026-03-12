object Check30 {
  def main(args: Array[String]): Unit = {
    def check(a: Int, b: Int): Boolean = {
      a == 30 || b == 30 || (a + b == 30)
    }
    println(check(10, 20))
    println(check(30, 5))
    println(check(15, 5))
  }
}
