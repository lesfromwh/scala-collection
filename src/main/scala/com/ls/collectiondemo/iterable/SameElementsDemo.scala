package com.ls.collectiondemo.iterable

/**
  * 检查两个iterable对象是否包含相同的元素,并且元素的顺序是否一致
  *
  * @author liushuang 2018/5/28
  */
object SameElementsDemo {
  def main(args: Array[String]): Unit = {
    val t1 = Iterable(1 to 3: _*)
    val t2 = Iterable(1 to 5: _*)
    val t3 = Iterable(1 to 5: _*)
    val t4 = Iterable(1, 2, 3, 5, 4)
    println(t1.sameElements(t2)) //false
    println(t2.sameElements(t3)) //true
    println(t2.sameElements(t4)) //false
  }
}
