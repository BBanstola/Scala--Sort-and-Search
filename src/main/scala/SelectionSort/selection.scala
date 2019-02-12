/**
  * Created by Own on 1/18/2019.
  */

def selectionSort(a:Array[Double]):Unit={

  val length = a.length

  for (i<-0 until length-1){
    var min = i
    for (j <- i+1 until length-1){
      if (a(j) < a(min)) min=j
    }
    val tmp = a(i)
    a(i) = a(min)
    a(min) = tmp
  }
}

def isSorted(a:Array[Double]):Boolean ={
  a.zip(a.tail).forall(t => t._1 <= t._2)
}