package com.ls.collectiondemo.traversble

import scala.collection.immutable.HashSet
import scala.collection.mutable

/**
  * @author liushuang 2018/5/25
  */
object TraversableConcatDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable("a", "b", 3)
    val set = HashSet(111, 222, 333)
    val c1 = Traversable.concat(t, set)
    val c2 = mutable.Traversable.concat(t, set)
    println(c1) //List(a, b, 3, 333, 111, 222)
    println(c2) //ArrayBuffer(a, b, 3, 333, 111, 222)
  }
}
