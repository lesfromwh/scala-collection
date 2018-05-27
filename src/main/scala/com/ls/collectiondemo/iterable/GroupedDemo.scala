package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/27
  */
object GroupedDemo {
  def main(args: Array[String]): Unit = {
    val t = Iterable(1 to 16: _*)
    println(t.repr)
    println(t.getClass) //class scala.collection.immutable.$colon$colon
    println(Traversable(1,2).getClass) //class scala.collection.immutable.$colon$colon

    val v = t.grouped(5)
    println(v.toList)
  }
}
