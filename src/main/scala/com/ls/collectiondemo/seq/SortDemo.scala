package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object SortDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(2, 1, 5, 3, 0)
    println(s.sorted) //List(0, 1, 2, 3, 5)

    println(s.sortWith(_ > _)) //List(5, 3, 2, 1, 0)
    println(s.sortWith(_ - _ > 0)) //List(5, 3, 2, 1, 0)

    println(s.sortBy(x => x)) //List(0, 1, 2, 3, 5)
  }
}
