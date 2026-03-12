object RemoveNeighbours {
  def main(args: Array[String]): Unit = {
    def removeChar(str: String, ch: Char): String = {
      str.zipWithIndex.filter {
        case (_, i) =>
          (i == 0 || str(i - 1) != ch) &&
          (i == str.length - 1 || str(i + 1) != ch) &&
          (str(i) != ch)
      }.map(_._1).mkString
    }
    println(removeChar("ababcabcd", 'b'))
  }
}

