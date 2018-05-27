package com.ls.collectiondemo.traversable

import scala.collection.mutable

/**
  * @author liushuang 2018/5/27
  */
object ViewDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    var v = t.view(0, 2)
    v.foreach(print) //12
    v = t.view
    v.foreach(print) //12345

    println()

    val l = mutable.Seq(1 to 5: _*)
    v = l.view(0, 2)
    val s = l.slice(0, 2)
    v.foreach(x => print(x + " ")) //1 2
    println(s) // ArrayBuffer(1, 2)
    l(1) = 100
    v.foreach(x => print(x + " ")) //1 100
    println(s) //ArrayBuffer(1, 2)
  }
}
