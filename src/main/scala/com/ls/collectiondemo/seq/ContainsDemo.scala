package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/28
  */
object ContainsDemo {
  def main(args: Array[String]): Unit = {
    val s = Seq(1 to 5: _*)
    println(s.contains(2)) //true
    println(s.containsSlice(Seq(1, 2))) //true
  }
}
