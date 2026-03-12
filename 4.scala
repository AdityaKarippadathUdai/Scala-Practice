object RemoveChar {
  def main(args: Array[String]): Unit = {
    def removeChar(str: String, pos: Int): String = {
      str.substring(0, pos) + str.substring(pos + 1)
    }
    println(removeChar("Scala", 2))
  }
}

