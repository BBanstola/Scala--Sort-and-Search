/**
  * Created by Own on 1/31/2019.
  */

def merge(l1:List[Double],l2:List[Double]):List[Double] = (l1,l2) match {
  case (Nil, l2) => l2
  case (l1, Nil) => l1
  case (h1::t1, h2::t2) =>
    if (h1 < h2) h1::merge(t1, l2)
    else h2::merge(l1,t2)
}

def mergeSort(lst:List[Double]):List[Double] = lst match {
  case Nil => lst
  case h::Nil =>lst
  case _ =>
    val (l1,l2)= lst.splitAt(lst.length/2)
    merge(mergeSort(l1), mergeSort(l2))
}




