package com.ls.collectiondemo.traversble

/**
  * 分组
  *
  * @author liushuang 2018/5/26
  */
object GroupDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 10: _*)

    println(t.splitAt(5)) //(List(1, 2, 3, 4, 5),List(6, 7, 8, 9, 10))
    println(t.span(_ < 7)) //(List(1, 2, 3, 4, 5, 6),List(7, 8, 9, 10))
    println(t.partition(_ % 2 == 0)) //(List(2, 4, 6, 8, 10),List(1, 3, 5, 7, 9))
    println(t.groupBy(_ % 3)) //Map(2 -> List(2, 5, 8), 1 -> List(1, 4, 7, 10), 0 -> List(3, 6, 9))
  }
}
