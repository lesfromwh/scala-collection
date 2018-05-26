package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/26
  */
object FoldDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable("a", "b", "c", "d")
    val str = t.fold("z")(_ + _)
    println(str) //zabcd

    println(t.foldRight("z")(_ + _)) //abcdz 为什么是这个结果
    //op(x_1, op(x_2, ... op(x_n, z)...))
    // (a+(b+(c+(d+z))))  =abcdz

    val t2 = Traversable(1, 2, 3)
    println(t2.foldRight("x")(_ + _))

    println(sum(t2))
    println(product(t2))
    println(count(t2))
  }

  def sum(t: Traversable[Int]): Int = t.fold(0)(_ + _)

  def product(t: Traversable[Int]): Int = t.fold(1)(_ * _)

  def count(t: Traversable[Int]): Int = t.fold(0)((sum, _) => sum + 1)

}
