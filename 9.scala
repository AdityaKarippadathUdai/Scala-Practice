object Armstrong {
  def main(args: Array[String]): Unit = {
    def isArmstrong(n: Int): Boolean = {
      val digits = n.toString.map(_.asDigit)
      digits.map(d => math.pow(d, digits.length)).sum == n
    }
    println(isArmstrong(153))
    println(isArmstrong(123))
  }
}
