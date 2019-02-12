/**
  * Created by Own on 1/31/2019.
  */

import scala.annotation.tailrec

@tailrec
def merge(l1:List[Double], l2:List[Double],lst:List[Double]):List[Double]= (l1,l2) match {
  case (_, Nil) => lst.reverse :::l1
  case (Nil, _) => lst.reverse :::l2
  case (h1::t1,h2::t2)=>
    if (h1 < h2) merge(t1,l2,h1::lst)
    else merge (l1,t2,h2::lst)
}

def mergeSort(lst:List[Double]):List[Double] = lst match {
  case Nil => lst
  case h::Nil => lst
  case _ =>
    val (l1,l2) = lst.splitAt(lst.length/2)
    merge(mergeSort(l1), mergeSort(l2),Nil)
}
