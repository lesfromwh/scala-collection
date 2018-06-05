package com.ls.collectiondemo.set

import scala.collection.mutable

/**
  * @author liushuang 2018/6/5
  */
object CloneDemo {
  def main(args: Array[String]): Unit = {
    //只有可变mutable才能调用, imutable会报错.
    val s1 = mutable.Set(1 to 5:_*)
    val s2 = s1.clone()
    println(s1 == s2) //true
    println(s1 eq s2) //false
  }
}
