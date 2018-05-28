package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object SizeDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 5: _*)
    println(t.size)
    println(t.length)
    println(t.lengthCompare(5)) // 0
    println(t.lengthCompare(1)) //1
    println(t.lengthCompare(10)) //-1
  }
}
