object PalindromeCheck {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 2, 1)
    println(s"Is palindrome: ${list == list.reverse}")
  }
}
