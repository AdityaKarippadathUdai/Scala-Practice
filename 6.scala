object TemperatureCheck {
  def main(args: Array[String]): Unit = {
    def check(temp: Int): String = {
      if (temp >= 80) "Go play golf"
      else if (temp >= 70 && temp <= 79) "Put on a jacket"
      else "It is way too cold."
    }
    println(check(95))
    println(check(72))
    println(check(50))
  }
}

