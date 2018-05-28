package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object ReverseDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1 to 6: _*)
    println(s.reverse) //List(6, 5, 4, 3, 2, 1)
    println(s.reverseIterator.toList) //List(6, 5, 4, 3, 2, 1)
    println(s.reverseMap(x => x)) //List(6, 5, 4, 3, 2, 1)
    println(s.reverseMap(x => x + 10)) //List(16, 15, 14, 13, 12, 11)
    println(s.reverseMap(_ + 10)) //List(16, 15, 14, 13, 12, 11)
  }
}
