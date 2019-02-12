/**
  * Created by Own on 1/31/2019.
  */

def quickSort(lst:List[Double]):List[Double] = lst match {
  case Nil => lst
  case h::Nil => lst
  case pivot::t =>
    val (less,greater) = t.partition(_<pivot)
    quickSort(less)  ::: (pivot :: quickSort(greater))
}

