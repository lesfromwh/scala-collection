package com.ls.collectiondemo.set

import scala.collection.BitSet

/**
  * @author liushuang 2018/6/5
  */
object BitSetDemo {
  def main(args: Array[String]): Unit = {
    val s = BitSet(1, 3, 64)
//    s.toBitMask.reverse.foreach(x => printf(toBinary(x)))

    //java.lang.Long.bitCount
    print(s.size)

  }

  def toBinary(i: Long, digits: Int = 64) = String.format("%" + digits + "s,", i.toBinaryString).replace(' ', '0')
}
