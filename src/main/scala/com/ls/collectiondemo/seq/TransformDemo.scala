package com.ls.collectiondemo.seq

import scala.collection.mutable

/**
  * @author liushuang 2018/5/30
  */
object TransformDemo {
  def main(args: Array[String]): Unit = {
    val s = mutable.Seq(1, 2, 3)
    //    s.transform(x => x * 10)
    val t = s.transform(_ * 10)
    println(t) //ArrayBuffer(10, 20, 30)
    println(s) //ArrayBuffer(10, 20, 30)
    println(t eq s) //true


    //map
    val s2 = mutable.Seq(1, 2, 3)
    val m = s2.map(_ * 10)
    println(m) //ArrayBuffer(10, 20, 30)
    println(s2) //ArrayBuffer(1, 2, 3)
    println(m eq s2) //false

    //map能产生不同类型的
    println(s2.map(_ + "!")) // ArrayBuffer(1!, 2!, 3!)
  }
}
