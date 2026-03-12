object ClassAverage {
  def main(args: Array[String]): Unit = {
    val marks = Array(50, 40, 60, 30, 20)
    val avg = marks.sum.toDouble / marks.length
    val belowAvg = marks.count(_ < avg)
    println(s"Class Average: $avg")
    if (belowAvg > 2) println("More than 2 students scored below average")
  }
}
