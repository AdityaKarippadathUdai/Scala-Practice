object Palindrome {
  def main(args: Array[String]): Unit = {
    def isPalindrome(n: Int): Boolean = {
      n.toString == n.toString.reverse
    }
    println(isPalindrome(121))
    println(isPalindrome(123))
  }
}

