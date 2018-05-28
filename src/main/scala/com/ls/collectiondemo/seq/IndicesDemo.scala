package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object IndicesDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 5: _*)
    println(t.indices) //Range 0 until 5
    println(Range(0, 5)) //Range 0 until 5
  }
}
