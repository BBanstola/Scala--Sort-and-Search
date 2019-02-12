/**
  * Created by Own on 1/21/2019.
  */

def shellSort(a:Array[Double]):Unit ={
  var gap = a.length/2
  while (gap >= 1){
    for (i <- gap until a.length){
      var j = i - gap
      var tmp = a(i)
      while (j >= 0 && tmp < a(j)){
        a(j+gap) = a(j)
        j -= gap
      }
      a(j+gap) = tmp
    }
    gap = (gap/2.2).round.toInt

  }
}

def isSorted(a:Array[Double]):Boolean={
  a.zip(a.tail).forall(t => t._1 <= t._2)
}