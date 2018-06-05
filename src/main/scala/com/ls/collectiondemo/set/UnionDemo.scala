package com.ls.collectiondemo.set

/**
  * @author liushuang 2018/6/4
  */
object UnionDemo {
  def main(args: Array[String]): Unit = {
    val s1 = Set(1 to 5: _*)
    val s2 = Set(4 to 8: _*)

    //交集
    println(s1 & s2) //Set(5, 4)
    println(s1.intersect(s2)) //Set(5, 4)
    println(s1 intersect s2) //Set(5, 4)

    //并集
    println(s1 | s2) //Set(5, 1, 6, 2, 7, 3, 8, 4)
    println(s1 union s2) //Set(5, 1, 6, 2, 7, 3, 8, 4)

    //差集
    println(s1 &~ s2) //Set(1, 2, 3)
    println(s1 diff s2) //取s1 Set(1, 2, 3)

    println(s2.diff(s1)) //Set(6, 7, 8)


  }
}
