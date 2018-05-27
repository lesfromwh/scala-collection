package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/27
  */
object ZipDemo {
  def main(args: Array[String]): Unit = {
    val t1 = Iterable(1 to 6: _*)
    val t2 = Iterable("a", "b", "c")
    //    t1 zip t2
    val tuples = t1.zip(t2)
    println(tuples) //List((1,a), (2,b), (3,c))
  }
}
