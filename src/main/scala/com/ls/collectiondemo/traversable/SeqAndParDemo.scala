package com.ls.collectiondemo.traversable

import scala.collection.parallel.ForkJoinTaskSupport

/**
  * @author liushuang 2018/5/27
  */
object SeqAndParDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 1000000: _*)
    val parT = t.par
    new ForkJoinTaskSupport(new scala.concurrent.forkjoin.ForkJoinPool(8))
    var seqT = t.seq

    System.gc()
    var time = System.currentTimeMillis()
    println(parT.sum) //1784293664
    println(System.currentTimeMillis() - time) //94

    System.gc()
    time = System.currentTimeMillis()
    println(seqT.sum)
    println(System.currentTimeMillis() - time) //24
  }
}
