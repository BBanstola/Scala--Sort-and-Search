
def bubbleSort(a:Array[Double]): Unit= {
  var temp = 0.0
  val len = a.length
  for (i <- 0 until len - 1) {
    for (j <- 0 until len - 1 - i) {
      if (a(j) > a(j + 1)) {
        temp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = temp
      }
    }
  }
}

def isSorted(a:Array[Double]):Boolean ={
  a.zip(a.tail).forall(t => t._1 <= t._2)
}