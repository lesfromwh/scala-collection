package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/26
  */
object ReduceDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 10: _*)

    println(t.reduce((acc, x) => acc + x)) //55
    //简写
    println(t.reduce(_ + _)) //55
    println(t.reduceLeft(_ + _))
    println(t.reduceRight(_ + _))

    val t2 = Traversable("a", "b", "c")
    println(t2.reduceLeft(_ + _)) //abc
    println(t2.reduceRight(_ + _)) //abc ? 为什么都是abc

    val t3 = Traversable(1 to 5: _*)
    println(t3.reduceLeft(_ - _)) // -13
    println(t3.reduceRight(_ - _)) //3
    // (1-(2-(3-(4-5))))
    // op(x_1, op(x_2, ..., op(x_{n-1}, x_n)...))
  }
}
