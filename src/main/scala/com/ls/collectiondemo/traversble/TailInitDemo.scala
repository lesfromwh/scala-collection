package com.ls.collectiondemo.traversble

/**
  * 得到除了第一个/最后一个元素的其他元素
  * @author liushuang 2018/5/26
  */
object TailInitDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    println(t.tail) //List(2, 3, 4, 5)
    val tails = t.tails
    println(tails.toBuffer)
    //ArrayBuffer(List(1, 2, 3, 4, 5), List(2, 3, 4, 5), List(3, 4, 5), List(4, 5), List(5), List())

    println(t.init) //List(1, 2, 3, 4)
    println(t.inits.toBuffer)
    //ArrayBuffer(List(1, 2, 3, 4, 5), List(1, 2, 3, 4), List(1, 2, 3), List(1, 2), List(1), List())
  }
}
