/**
  * Created by Own on 1/18/2019.
  */

def insertionSort(a:Array[Double]):Unit ={
  val len = a.length
  for (i <- 1 until len){
    var j = i-1
    var tmp = a(i)
    while (j >= 0 && tmp < a(j)){
      a(j+1) =a(j)
      j -= 1
    }
    a(j+1) = tmp
  }
}

def isSorted(a:Array[Double]):Boolean ={
  a.zip(a.tail).forall(t => t._1 <= t._2)
}