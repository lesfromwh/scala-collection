package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/26
  */
object FoldDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable("a", "b", "c", "d", "e")
    val str = t.fold("z")(_ + _)
    println(str) //zabcde

    println(t.foldRight("z")(_ + _)) //abcdez

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
