package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/27
  */
object TabulateDemo {
  def main(args: Array[String]): Unit = {
    println(Traversable.tabulate(5)(_ * 10)) //List(0, 10, 20, 30, 40)
    println(Traversable.tabulate(5, 2)(_ * 10 + _))
    //List(List(0, 1), List(10, 11), List(20, 21), List(30, 31), List(40, 41))

  }
}
