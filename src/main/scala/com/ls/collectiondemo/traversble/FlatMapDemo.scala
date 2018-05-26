package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/26
  */
object FlatMapDemo {
  def main(args: Array[String]): Unit = {
    val s =
      """hello world
        |hello spark
        |hello gays""".stripMargin
    println(s)
    val tt:Traversable[String] = for(x<-s.split("\r\n")) yield x
    println(tt)

    val strings = tt flatMap(x=>x split("\\W+"))
    println(strings)
  }


}
