package com.ls.collectiondemo.set

import scala.collection.mutable


/**
  * @author liushuang 2018/6/5
  */
object SortedSetDemo {
  def main(args: Array[String]): Unit = {
    val s = mutable.SortedSet(5, 4, 3, 2, 1)
    println(s) //TreeSet(1, 2, 3, 4, 5)

    val s2 = mutable.SortedSet(5, 4, 3, 2, 1)(Ordering[Int].reverse)
    println(s2) //TreeSet(5, 4, 3, 2, 1)

    //Sorted继承Sorted特质,继承了获取子集合的一些方法.from range to until
    println(s from 2 to 4) //TreeSet(2, 3, 4)
    println(s from 2 until 4) //TreeSet(2, 3)
    println(s range(2, 4)) //TreeSet(2, 3)
    println(s.rangeImpl(Some(2), None)) //TreeSet(2, 3, 4, 5)

    //获取>=某个元素的迭代器
    //    val it = s.iteratorFrom(2)
    val it = s.keysIteratorFrom(2)
    println(it foreach (print)) //2345()

    //
    println(s.ordering.getClass.getName) //scala.math.Ordering$Int$
    println(s.ordering.compare(s.head, s.tail.head)) //compare(1,2) -1
    println(s.compare(s.head, s.tail.head)) //-1

    println(s.firstKey) //1
    println(s.lastKey) //5
    println(s.keySet) //TreeSet(1, 2, 3, 4, 5)

    val s3 = mutable.SortedSet(1, 3, 2, 4, 7)
    s3 += 6
    println(s3) //TreeSet(1, 2, 3, 4, 6, 7)
  }
}
