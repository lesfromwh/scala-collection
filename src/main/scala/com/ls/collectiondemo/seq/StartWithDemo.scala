package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object StartWithDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq("a", "b", "c")
    println(s.startsWith("a")) //false
    println(s.endsWith("c")) //false

    println(s.startsWith(Seq("a"))) //true
    println(s.endsWith(Seq("c"))) //true
  }
}
