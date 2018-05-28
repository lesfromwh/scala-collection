package com.ls.collectiondemo.seq

/** 如果序列中包含这个集合,则返回子序列的第一个元素的索引
  *
  * @author liushuang 2018/5/28
  */
object IndexOfSliceDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 10: _*)
    println(t.indexOfSlice(Seq(1, 2))) // 0
    println(t.indexOfSlice(Seq(1, 2, 2))) // -1
    println(t.indexOfSlice(Seq(1, 2), 2)) // -1

    println(t.lastIndexOfSlice(Seq(1, 2))) //0
    println(t.lastIndexOfSlice(Seq(1, 2, 2))) //-1
    println(t.lastIndexOfSlice(Seq(7, 8, 5))) //-1

    println(t.lastIndexOfSlice(Seq(7, 8))) //6
    println(t.lastIndexOfSlice(Seq(7, 8), 7)) //6
  }
}
