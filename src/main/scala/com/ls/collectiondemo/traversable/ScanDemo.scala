package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/26
  */
object ScanDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    val result1 = t.scan(1)(_ * _)
    println(result1)
    println(result1.tail)

    println(t.scanRight(1)(_ * _))
    //    List(120, 120, 60, 20, 5, 1)
    //t = List(1,2,3,4,5)
    //计算步骤
    //1. 1*5 =5
    //2. 5*4=20
    //3 20*3=60
    //4 60*2=120
    //5  120*1 =120
  }

}
