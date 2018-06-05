package com.ls.collectiondemo.set

/**
  * contains apply subsetOf
  * @author liushuang 2018/6/4
  */
object ContainsDemo {
  def main(args: Array[String]): Unit = {
    val s = Set(1 to 5: _*)
    println(s.contains(1)) //true
    println(s.contains(6)) //false

    //apply
    println(s.apply(1)) //true  this contains elem
    println(s(1)) //true


    //s是入参的subset(子集)
    println(s.subsetOf(Set(1, 2))) //false
    println(s.subsetOf(Set(1, 1))) //false
    println(s.subsetOf(Set(1 to 6:_*))) //true
  }
}
