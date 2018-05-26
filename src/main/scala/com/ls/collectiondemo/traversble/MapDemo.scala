package com.ls.collectiondemo.traversble

/**
  * @author liushuang 2018/5/26
  */
object MapDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*) //List(1, 2, 3, 4, 5)
    val result = t.map(x => x * x)
    println(result)
  }


}
