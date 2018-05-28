package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/28
  */
object TakeRightDemo {
  def main(args: Array[String]): Unit = {
    val t = Iterable(1 to 5: _*)
    println(t.takeRight(3)) //List(3, 4, 5)
  }
}
