package com.ls.collectiondemo.set

/**
  * @author liushuang 2018/6/4
  */
object ArraySetTest {
  def main(args: Array[String]): Unit = {
    val s1 = ArraySet(1,2,3,3)
    println(s1)
    println(s1+(3,4,5))
    println(s1)
  }
}
