package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/30
  */
object IntersectDemo {
  def main(args: Array[String]): Unit = {
    val s1 = Seq(1 to 5: _*)
    val s2 = Seq(3 to 8: _*)

    println(s1.intersect(s2)) //List(3, 4, 5)
    println(s1.diff(s2)) //List(1, 2)
    println(s2.diff(s1)) //List(6, 7, 8)
    println(s1.union(s2)) //List(1, 2, 3, 4, 5, 3, 4, 5, 6, 7, 8)

    val s3 = Seq(5, 5, 5, 6, 6)
    val s4 = Seq(5, 5, 5, 5, 7, 8)

    println(s3.intersect(s4)) //List(5, 5, 5)
    println(s3.diff(s4)) //List(6, 6)
    println(s4.diff(s3)) //List(5, 7, 8)
    println(s3.union(s4)) //List(5, 5, 5, 6, 6, 5, 5, 5, 5, 7, 8)
  }
}
