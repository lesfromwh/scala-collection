package com.ls.collectiondemo.map

import scala.collection.mutable

/**
  * @author liushuang 2018/6/11
  */
object DeleteDemo {
  def main(args: Array[String]): Unit = {
    val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(m - ("a")) //Map(b -> 2, c -> 3)
    println(m -- Seq("b"))


    val m2 = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)
    m2 -= ("a")
    println(m2) //Map(b -> 2, c -> 3)
    m2 --= Seq("b")
    println(m2) //Map(c -> 3)
    m2.remove("c")
    println(m2) //Map()
    m2.put("d", 4)
    m2.clear()
    println(m2) //Map()
  }
}
