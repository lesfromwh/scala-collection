package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object IndexWhereDemo {
  def main(args: Array[String]): Unit = {
    val t = Seq(1 to 10: _*)
    //返回小于5的第一个偶数的索引
    //从from开始 包含from
    println(t.indexWhere(x => x % 2 == 0 && x < 5)) //1
    println(t.indexWhere(x => x % 2 == 0 && x < 5, 1)) //1
    println(t.indexWhere(x => x % 2 == 0 && x < 5, 6)) //-1

    //返回小于5的最后一个偶数的索引
    println(t.lastIndexWhere(x => x % 2 == 0 && x < 5)) // 3
    println(t.lastIndexWhere(x => x % 2 == 0 && x < 5, 0)) //-1
  }
}
