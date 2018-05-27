package com.ls.collectiondemo.traversable

/**
  * 聚合函数
  *
  * @author liushuang 2018/5/26
  */
object AggregationDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 4: _*)

    println(t.sum) //底层fold
    println(t.product) //底层fold
    println(t.min) //底层reduce
    println(t.max) //底层reduce

    val words = Traversable("a b c d e f gg".split("\\W+"): _*)
    val i = words.aggregate(0)(_ + _.length, _ + _)
    val j = words.aggregate(0)(_ + _.length, (_, _) => 0)
    println(i) //8
    println(j) //8
    println(words.par) //ParVector(a, b, c, d, e, f, gg)

    //由于没有进行分区 combop被忽略,最后一个参数不会影响结果
    println(words.par.aggregate(0)(_ + _.length, (_, _) => 0)) //0 进行分区了 所有是0
  }
}
