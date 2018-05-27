package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/26
  */
object FilterDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)

    println(t.filter(_ < 5)) //List(1, 2, 3, 4)
    println(t.filterNot(_ < 3)) //List(3, 4, 5)
    println(t.withFilter(_ < 3)) //scala.collection.TraversableLike$WithFilter@340f438e
  }
}
