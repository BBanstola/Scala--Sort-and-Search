/**
  * Created by Own on 1/24/2019.
  */

def insertionList(lst:List[Double]): List[Double] ={
  def insert(x:Double, sorted:List[Double]):List[Double] =sorted match{
      case Nil => x::Nil
      case h::t =>if (x < h) x::sorted else h::insert(x,t)
  }

  def helper(sorted:List[Double], unSorted:List[Double]): List[Double] = unSorted match {
      case Nil => sorted
      case h::t =>helper(insert(h,sorted),t)
  }
  helper(Nil, lst)
}

 