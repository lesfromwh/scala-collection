package com.ls.collectiondemo.map

/**
  * @author liushuang 2018/6/11
  */
object GetDemo {
  def main(args: Array[String]): Unit = {
    val m = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(m("a")) //1
    //    println(m("d")) //NoSuchElementException
    println(m.get("a")) //Some(1)
    println(m.get("d")) //None
    println(m.getOrElse("d", 10))

    val m2 = m.withDefaultValue(-1)
    println(m2("d")) //-1

    val m3 = m.withDefault(_.charAt(0) - 'a')
    println(m2("d")) //-1
  }
}
