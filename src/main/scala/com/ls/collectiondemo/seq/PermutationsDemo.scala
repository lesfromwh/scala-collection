package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/30
  */
object PermutationsDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(2, 5, 7)
    println(s.permutations.foreach(println))
//    List(2, 5, 7)
//    List(2, 7, 5)
//    List(5, 2, 7)
//    List(5, 7, 2)
//    List(7, 2, 5)
//    List(7, 5, 2)
//    ()

    val s2 =Seq(1,1,3)
    println(s2.permutations.foreach(println))
//    List(1, 1, 3)
//    List(1, 3, 1)
//    List(3, 1, 1)
//    ()
  }
}
