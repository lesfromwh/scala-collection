package com.ls.collectiondemo.set

import scala.collection.mutable

/**
  * @author liushuang 2018/6/4
  */
object RemoveDemo {
  def main(args: Array[String]): Unit = {
    val s = Set(1 to 5: _*)
    println(s - 3) //Set(5, 1, 2, 4)
    println(s - 8) //如果去除不存在的元素,返回原来的集合,不会创建新的集合. Set(5, 1, 2, 3, 4)

    println(s -- Traversable(2, 3)) //Set(5, 1, 4)

    val s2 = mutable.Set(1 to 5: _*)
    println(s2) //Set(1, 5, 2, 3, 4)
    println(s2.remove(2)) //true
    println(s2) //Set(1, 5, 3, 4)

    s2.retain(_ < 2)
    println(s2) //Set(1)
  }
}
