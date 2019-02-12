/**
  * Created by Own on 1/24/2019.
  */

case class Student(lName:String, fName: String, avg: Double)

def bubbleStudent(a:Array[Student],f:(Student, Student)=>Boolean): Unit= {
  val len = a.length
  for (i <- 0 until len - 1) {
    for (j <- 0 until len - 1 - i) {
      if (f(a(j),a(j+1))) {
        val temp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = temp
      }
    }
  }
}


