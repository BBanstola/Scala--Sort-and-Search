/**
  * Created by Own on 1/25/2019.
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

def bucketSort(a:Array[Double]):Unit = {
  val min = a.min
  val max = a.max
  val buckets = Array.fill(a.length)(List[Double]())
  for (x <- a){
    val b = ((x-min)*(buckets.length-1)/(max - min)).toInt
    buckets(b) ::= x
  }
  var i = 0
  for (bucket <- buckets; x <- bucket){
    a(i) = x
    i += 1
  }
  insertionSort(a)
  }

