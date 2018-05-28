package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object PatchDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1 to 10: _*)
    println(s.patch(3, Seq(8, 9), 1)) //List(1, 2, 3, 8, 9, 5, 6, 7, 8, 9, 10)
    println(s.patch(3, Seq(8, 9), 2)) //List(1, 2, 3, 8, 9, 6, 7, 8, 9, 10)
    println(s.patch(3, Seq(8, 9), 4)) //List(1, 2, 3, 8, 9, 8, 9, 10)
  }
}
