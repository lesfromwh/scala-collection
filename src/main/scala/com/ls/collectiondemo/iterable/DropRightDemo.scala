package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/28
  */
object DropRightDemo {
  def main(args: Array[String]): Unit = {
    val t = Iterable(1 to 5: _*)
    println(t.dropRight(2)) //List(1, 2, 3)
  }
}
