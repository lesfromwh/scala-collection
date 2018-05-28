package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/28
  */
object ZipWithIndexDemo {
  def main(args: Array[String]): Unit = {
    val t = Iterable(1 to 5: _*)
    val index = t.zipWithIndex
    println(index) //List((1,0), (2,1), (3,2), (4,3), (5,4))

    //将索引放到第一个位子
    val map = index.map(x => (x._2, x._1))
    println(map) //List((0,1), (1,2), (2,3), (3,4), (4,5))

    val tuples = t.view.zipWithIndex map (x=>(x._2,x._1)) force;
    println(tuples) //List((0,1), (1,2), (2,3), (3,4), (4,5))
  }
}
