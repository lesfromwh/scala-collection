package com.ls.collectiondemo.map

import scala.collection.mutable

/**
  * @author liushuang 2018/6/11
  */
object AddDemo {
  def main(args: Array[String]): Unit = {
    val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(m + ("d" -> 4))
    println(m ++ Seq("d" -> 4))
    println(m ++: Map("d" -> 4))


    //可变map
    val m2 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    m2 += ("d" -> 4)
    println(m2)
    m2 ++= Seq("e" -> 5)
    println(m2)
    m2.put("g", 6)
    println(m2)
    //key 不能为null
  }
}
