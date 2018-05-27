package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/27
  */
object SlidingDemo {
  def main(args: Array[String]): Unit = {
    val t = Iterable(1 to 6:_*)
    val result = t.sliding(3,2)
    println(result.toList)
    //List(List(1, 2, 3), List(3, 4, 5), List(5, 6))
  }
}
