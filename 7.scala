object DrivingEligibility {
  def main(args: Array[String]): Unit = {
    def check(age: Int): String = {
      if (age >= 16) "You are old enough to drive."
      else s"You have to wait ${16 - age} years to drive legally."
    }
    println(check(18))
    println(check(14))
  }
}

