package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object PadToDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1 to 5: _*)
    println(s :+ 2)
    println(2 +: s)
    //原本长度是5,生成一个长度为6的序列.
    println(s.padTo(6, 2))
    println(s.padTo(2, 8))
  }
}
