package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/26
  */
object ForAllExistCountDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 10: _*)

    println(t.forall(_ < 10))
    println(t.forall(_ > 5))

    println(t.exists(_ < 10))
    println(t.exists(_ > 10))

    //如果是空集合返回true
    println(Traversable.empty[Int].forall(_ < 6)) //true
    println(Traversable.empty[Int].forall(_ => false)) //true

    //统计满足断言的个数
    println(t.count(_ < 6))

    //不要使用如下操作计算个数,因为filter会产生一个新的集合,浪费空间
    println(t.filter(_ < 6).size)
  }
}
