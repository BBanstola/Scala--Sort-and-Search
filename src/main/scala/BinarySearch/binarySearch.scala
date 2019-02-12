/**
  * Created by Own on 1/24/2019.
  */

def binary1(a:Array[Int], value: Int):Unit = {
  var start = 0
  var end = a.length
  var mid = (end + start )/ 2
  while (end > start && a(mid)!=value){
    if (value < mid){
      end = mid
    }
    else{
      if (value > mid){
        start = mid +1
      }
      mid = (end + start) /2
    }
    if (end > start)println( mid ) else println(-1)
  }
}

def binary(a:Array[Int], value:Int):Int = {
  def binary2(a: Array[Int], value: Int, start: Int, end: Int): Int = {
    if (end <= start) -1 else {
      val mid = (start + end) / 2
      if (a(mid) == value) mid
      else if (value < a(mid)) binary2(a, value, start, mid)
      else binary2(a, value, mid, end)
    }
  }
  binary2(a, value, 0, a.length)
}

