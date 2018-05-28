package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object ApplyDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 5: _*)
    println(t.apply(2))
    println(t(2))
    println(t(10)) //Exception in thread "main" java.lang.IndexOutOfBoundsException: 10
  }
}
