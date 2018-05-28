package com.ls.collectiondemo.seq

/**
  * 得到某个元素的索引值
  * 第二个参数the start index
  *
  * @author liushuang 2018/5/28
  */
object IndexOfDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 5: _*) ++ Seq(1 to 3: _*)
    println(t.indexOf(2))
    println(t.indexOf(2, 2)) //6
    println(t.indexOf(4, 5)) // -1

    //总在index<=end范围内搜索
    println(t.lastIndexOf(3)) //7
    println(t.lastIndexOf(3, 2)) //2
    println(t.lastIndexOf(3, 1)) //-1
    println(t.lastIndexOf(3, 7)) //7
  }
}
