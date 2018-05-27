package com.ls.collectiondemo.traversable

/**
  * 集合类型转换
  *
  * @author liushuang 2018/5/27
  */
object TraversableTypeConvert {
  def main(args: Array[String]): Unit = {
    val t = Traversable(1 to 5: _*)

    println(t.toArray) //[I@5a39699c
    println(t.toArray.mkString(t.toArray.stringPrefix + "(", ",", ")")) //[I(1,2,3,4,5)

    println(t.toParArray) //ParArray(1, 2, 3, 4, 5)
    println(t.toBuffer) //ArrayBuffer(1, 2, 3, 4, 5)
    println(t.toIndexedSeq) //Vector(1, 2, 3, 4, 5)
    println(t.toIterable) //List(1, 2, 3, 4, 5)
    println(t.toIterator) //non-empty iterator
    println(t.toList) //List(1, 2, 3, 4, 5)
    println(t.toSeq) //List(1, 2, 3, 4, 5)
    println(t.toStream) //Stream(1, ?)
    println(t.toVector) //Vector(1, 2, 3, 4, 5)
    println(t.toTraversable) //List(1, 2, 3, 4, 5)
    println(Traversable("a" -> 1, "b" -> 2).toMap) //Map(a -> 1, b -> 2)
    println(t.to) //Vector(1, 2, 3, 4, 5)
  }
}
