package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object SegmenLengthDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 10: _*)
    println(t.segmentLength(_ < 5, 2)) //2  Seq(3,4)长度为2
    println(t.segmentLength(_ < 5, 1)) //2  Seq(2,3,4)长度为2

    //调用的是segmentLength,from=0
    println(t.prefixLength(_ < 5)) //2  Seq(1,2,3,4)长度为4
  }
}
