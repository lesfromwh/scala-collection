package com.ls.collectiondemo.traversable

import scala.collection.mutable

/**
  * 查看具体实现类
  *
  * @author liushuang 2018/5/27
  */
object ReprDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    val r = t.repr
    println(r) //List(1, 2, 3, 4, 5)
    val l = mutable.Seq(1 to 5: _*)
    println(l) //ArrayBuffer(1, 2, 3, 4, 5)
  }
}
