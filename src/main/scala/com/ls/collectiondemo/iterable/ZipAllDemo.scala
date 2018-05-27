package com.ls.collectiondemo.iterable

/**
  * @author liushuang 2018/5/27
  */
object ZipAllDemo {
  def main(args: Array[String]): Unit = {
    val t1 = Iterable(1 to 6: _*)
    val t2 = Iterable("a", "b", "c")
    println(t1.zipAll(t2, "E", 100))
    //List((1,a), (2,b), (3,c), (4,100), (5,100), (6,100))

    println(t2.zipAll(t1, "E", 100))
    //List((a,1), (b,2), (c,3), (E,4), (E,5), (E,6))


  }
}
