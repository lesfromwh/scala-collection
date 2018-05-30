package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/30
  */
object CorrespondsDemo {
  def main(args: Array[String]): Unit = {
    val s1 = Seq(1 to 5: _*)
    val s2 = Seq(1 to 5: _*)
    println(s1.corresponds(s2)(_ == _)) //true
    println(s1.corresponds(s2)(_ == _ * 2)) //false
  }
}
