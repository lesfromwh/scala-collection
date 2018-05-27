package com.ls.collectiondemo.traversable

import scala.collection.mutable

/**
  * copyToArray copyToBuffer
  *
  * @author liushuang 2018/5/27
  */
object CopyToArrayDemo {

  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    val result = new Array[Int](t.size)
    println(result.mkString(",")) //0,0,0,0,0
    t.copyToArray(result)
    println(result.mkString(",")) //1,2,3,4,5

    val result2 = new Array[Int](t.size * 2)
    t.copyToArray(result2, 3, 8)
    println(result2.mkString(",")) //0,0,0,1,2,3,4,5,0,0
    t.copyToArray(result2, 0, 10)
    println(result2.mkString(",")) //1,2,3,4,5,3,4,5,0,0


    val buffer = mutable.Buffer[Int]()
    t.copyToBuffer(buffer)
    println(buffer) //ArrayBuffer(1, 2, 3, 4, 5)
  }
}
