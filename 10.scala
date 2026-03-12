object SumInString {
  def main(args: Array[String]): Unit = {
    val str = "it 15 is25 a 20string"
    val sum = "\\d+".r.findAllIn(str).map(_.toInt).sum
    println(s"Sum of numbers: $sum")
  }
}
