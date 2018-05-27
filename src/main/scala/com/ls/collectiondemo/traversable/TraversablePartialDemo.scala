package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/25
  */
object TraversablePartialDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val result = t collect filterEven2
//    println(result)
    val first =  t collectFirst filterEven3
    println(first) //Some(2) some extends option
  }

  def filterEven1: PartialFunction[Int, Int] = {
    case n if n % 2 == 0 => n
  }

  def filterEven2: PartialFunction[Int, String] = {
    case n if n % 2 == 0 => n + "A与B(e.g. Int=>String)可以不一致"
  }

  def filterEven3: PartialFunction[Int, Int] = {
    //    case n if n % 2 == 0 => n
    case n if n==11 =>n //匹配不到的时候返回的是None
  }

}
