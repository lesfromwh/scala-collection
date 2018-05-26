package com.ls.collectiondemo.traversble

/**
  * 得到集合的钱n个元素
  *
  * @author liushuang 2018/5/26
  */
object TakeDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)

    //take(n) 等价于 slice(0,3)
    println(t.take(3)) //List(1, 2, 3)
    println(t.take(7)) //List(1, 2, 3, 4, 5)

    //takeWhile 根据断言来选择元素,直到不满足条件为止
    println(t.takeWhile(n => n < 3)) //List(1, 2)
    //简写
    println(t.takeWhile(_ < 3))
  }
}
