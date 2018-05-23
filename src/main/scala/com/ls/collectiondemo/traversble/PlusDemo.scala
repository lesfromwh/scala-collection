package com.ls.collectiondemo.traversble

import scala.collection.immutable.HashSet
import scala.reflect.runtime.universe._
/**
  * ++
  *
  * @author liushuang 2018/5/23
  */
object PlusDemo {
  def main(args: Array[String]): Unit = {
    val t = Traversable("a", "b", 3)
    val set = HashSet(111, 222, 333)
    val newColle = t ++ set
    println(newColle)   //List(a, b, 3, 333, 111, 222)
    println(newColle.getClass) //class scala.collection.immutable.$colon$colon
    println(getInnerType(newColle)) //Any
    //也就是说newColle的时间类型是一个List[Any]

    import scala.reflect.NameTransformer._
    val ops = "~=<>!#%^&|*/+-:\\?@"
    ops map(o=>o->encode(o.toString)) foreach(println)

//    (~,$tilde)
//    (=,$eq)
//    (<,$less)
//    (>,$greater)
//    (!,$bang)
//    (#,$hash)
//    (%,$percent)
//    (^,$up)
//    (&,$amp)
//    (|,$bar)
//    (*,$times)
//    (/,$div)
//    (+,$plus)
//    (-,$minus)
//    (:,$colon)
//    (\,$bslash)
//    (?,$qmark)
//    (@,$at)

  }

  def getInnerType[T](t:Traversable[T])(implicit tag:TypeTag[T]) = tag.tpe.toString

}
