/**
  * Created by Own on 1/22/2019.
  */


def indexOf(a:Array[Int], c:Int):Int ={
  var i = 0
  while (i<a.length && a(i)!=c ) i+= 1
  if (i < a.length) i else -1
}

def find(a:Array[Int], p:Int => Boolean):Option[Int] ={
  var i = 0
  while (i<a.length && !p(a(i)) ) i+= 1
  if (i < a.length) Some(a(i)) else None
}
