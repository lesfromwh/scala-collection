package com.ls.collectiondemo.set

/**
  * @author liushuang 2018/6/4
  */
object AddDemo {
  def main(args: Array[String]): Unit = {
    val s1 = Set(1, 2, 3, 3)
    println(s1 + 4) //Set(1, 2, 3, 4)
    println(s1 + (5, 6, 7)) //Set(5, 1, 6, 2, 7, 3)

    val s2 = Set(1, 2, 3, 3)
    println(s1 ++ Set(1, 8)) //Set(1, 2, 3, 8)

    val s3 = Set(1, 2, 3, 3, 8)
    println(s3 ++: Set(4, 5, 6, 4, 1)) //Set(5, 1, 6, 2, 3, 8, 4)

  }
}
