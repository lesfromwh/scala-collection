package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/23
  */
object ForeachDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1, 2, 3)
    t.foreach(x => x)
    t foreach (print)
    t.foreach(print)
    t.foreach(print(_))
    t.foreach(x => print(x + 3))
    //空没有结果  123 123 123 456
  }
}
