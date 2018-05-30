package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/30
  */
object DistinctDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1, 1, 2, 2, 3, 4, 5, 6, 6)
    println(s.distinct) //List(1, 2, 3, 4, 5, 6)
  }
}
