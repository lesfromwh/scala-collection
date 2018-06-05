package com.ls.collectiondemo.set

import scala.collection.SetLike
import scala.collection.generic.{CanBuildFrom, GenericCompanion, GenericSetTemplate, ImmutableSetFactory}
import scala.collection.mutable.ArrayBuffer

/**
  * 实现自定义set
  *
  * @author liushuang 2018/6/4
  */
class ArraySet[A] extends Set[A]
  with GenericSetTemplate[A, ArraySet]
  with SetLike[A, ArraySet[A]] {

  private val arr = ArrayBuffer[A]()

  override def companion: GenericCompanion[ArraySet] = ArraySet

  override def contains(elem: A) = arr.contains(elem)

  override def +(elem: A) = {
    if (!this.contains(elem)) {
      arr += elem
    }
    this
  }

  override def -(elem: A) = {
    arr -= elem
    this
  }

  override def iterator = arr.iterator
}

object ArraySet extends ImmutableSetFactory[ArraySet] {
  override implicit def setCanBuildFrom[A]: CanBuildFrom[Coll, A, ArraySet[A]] = setCanBuildFrom[A]

  def emptyInstance: ArraySet[Any] = new ArraySet[Any]()
}
