package com.ls.collectiondemo.traversble

/**
  * from -> until 含头不含尾.脚标与java规则一直.
  * 一般from->to是含头含尾
  *
  * @author liushuang 2018/5/26
  */
object SliceDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    val slice = t.slice(0, 3)
    println(slice)
    //List(1, 2, 3)

    //越界不报错
    println(t.slice(1, 8))
    //List(2, 3, 4, 5)
  }
}
