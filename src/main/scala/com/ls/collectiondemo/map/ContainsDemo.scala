package com.ls.collectiondemo.map

/**
  * @author liushuang 2018/6/11
  */
object ContainsDemo {
  def main(args: Array[String]): Unit = {
    val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(m.contains("a"))
    println(m.contains("d"))
    println(m.isDefinedAt("a")) //底层还是contains
  }
}
