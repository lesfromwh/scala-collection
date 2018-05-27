package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/27
  */
object RangeDemo {
  def main(args: Array[String]): Unit = {
    println(Traversable.range(1, 10, 3)) //List(1, 4, 7)

    //如果没有指定step大小默认为1
    println(Traversable.range(1, 5)) //List(1, 2, 3, 4)
  }
}
