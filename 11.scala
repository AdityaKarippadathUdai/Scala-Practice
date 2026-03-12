object RotationCheck {
  def main(args: Array[String]): Unit = {
    def areRotation(s1: String, s2: String): Boolean = {
      (s1 + s1).contains(s2)
    }
    println(areRotation("ABACD", "CDABA"))
  }
}
