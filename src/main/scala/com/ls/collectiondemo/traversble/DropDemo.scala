package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/26
  */
object DropDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)

    println(t.drop(2)) //List(3, 4, 5)
    println(t.drop(0)) //List(1, 2, 3, 4, 5)
    println(t.drop(8)) //List()

    val t1 = Traversable(1, 1, 2, 2, 3, 4)
    println(t1.dropWhile(_ < 3)) //List(3, 4)
    println(t1.dropWhile(_ < 2)) //List(2, 2, 3, 4)
  }
}
