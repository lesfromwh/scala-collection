package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/27
  */
object FillDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable.fill(5)("A")
    println(t)

    println(Traversable.fill(5, 3)("A"))
    // List(List(A, A, A), List(A, A, A), List(A, A, A), List(A, A, A), List(A, A, A))

    println(Traversable.iterate(1, 4)(_ * 10))
    //List(1, 10, 100, 1000)
  }
}
