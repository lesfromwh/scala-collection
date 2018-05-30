package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/30
  */
object CombinationsDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1, 2, 3, 4)
    println(s.combinations(3).toList)
    //List(List(1, 2, 3), List(1, 2, 4), List(1, 3, 4), List(2, 3, 4))

    println(s.combinations(4).toList) //List(List(1, 2, 3, 4))

    println(s.combinations(-1)) //empty iterator
    println(s.combinations(-1).toList) //List()

    println(s.combinations(0).toList) //List(List())
  }
}
