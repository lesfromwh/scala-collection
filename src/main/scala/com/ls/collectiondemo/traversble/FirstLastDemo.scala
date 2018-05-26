package com.ls.collectiondemo.traversble

/**
  * head lase headOption lastOption find
  *
  * @author liushuang 2018/5/26
  */
object FirstLastDemo {
  def main(args: Array[String]): Unit = {
    val t1 = Traversable(1 to 5: _*)
    val empty = Traversable.empty
    //    println(t1.head) //1
    //    println(t1.last) //5
    //    println(t1.tail) //List(2, 3, 4, 5)
    //    println(empty.head) //NoSuchElementException
    //    println(empty.last) //NoSuchElementException
    //    println(empty.tail) //nsupportedOperationException: tail of empty list
    println(t1.headOption) //Some(1)
    println(t1.headOption isDefined) //正常编译
    println(empty headOption) //None
    //    println(empty headOption isDefined) //编译报错  我觉得还是写点比较好

    //查找第一个满足条件的元素
    println(t1.find(_ % 2 == 0)) //Some(2)
  }
}
