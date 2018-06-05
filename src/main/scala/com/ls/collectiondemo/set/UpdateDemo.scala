package com.ls.collectiondemo.set

import scala.collection.mutable

/**
  * @author liushuang 2018/6/4
  */
object UpdateDemo {
  def main(args: Array[String]): Unit = {
    val s = mutable.Set(1 to 5: _*)
    s.update(2, true)
    println(s) //Set(1, 5, 2, 3, 4)
    s.update(2, false)
    println(s) //Set(1, 5, 3, 4)

    //简写
    // f(x)=y 等价于f.update(x,y)
    s(3) = false
    println(s) //Set(1, 5, 4)
  }
}
