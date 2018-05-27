package com.ls.collectiondemo.traversable

/**
  * mkString,addString,stringPrefix
  * @author liushuang 2018/5/27
  */
object TraversableString {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)
    println(t.mkString(","))
    println(t.mkString("start",",","end"))

    val sb = new StringBuilder
    sb.clear()
      t.addString(sb,",")
    println(sb)
    sb.clear()
    t.addString(sb,"start",",","end")
    println(sb)

    println(t.repr.getClass.getName) //scala.collection.immutable.$colon$colon
    println(t.stringPrefix) //List
    //override def stringPrefix = "List"  返回list的原因是被重写了.
  }
}
