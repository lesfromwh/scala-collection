package com.ls.collectiondemo.seq

import scala.collection.mutable

/**
  * @author liushuang 2018/5/28
  */
object UpdatedDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1 to 5: _*)

    println(s.updated(1, 8)) //List(1, 8, 3, 4, 5)
    println(s) //List(1, 2, 3, 4, 5)

    val s2 = mutable.Seq(1 to 5: _*)
    println(s2.updated(1, 8)) //ArrayBuffer(1, 8, 3, 4, 5)
    println(s2) //ArrayBuffer(1, 2, 3, 4, 5)
  }
}
