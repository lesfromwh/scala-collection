package com.ls.collectiondemo.traversable

/**
  * @author liushuang 2018/5/23
  */
object FlattenDemo {
  def main(args: Array[String]): Unit = {
    val t1 = Traversable(Traversable(1, 2, 3), Traversable(3, 2, 8))
    val f1 = t1.flatten
    print(f1)
    //List(1, 2, 3, 3, 2, 8)

    //1.如果traversable的元素类型 不一致,也是可以展开的
    val t2 = Traversable(Traversable(1, 2, 3), Traversable("1", "2", 8))
    val f2 = t2.flatten
    print(f2)

    //2.如果集合的元素有的是普通类型,有的又是集合类型,那么能平展吗?不能,需要隐式转换
    //Traversable(Traversable(1, 2, 3), 2,3) 需要 int2traversable的隐式转换
    //3.平展方法只做浅层平展
  }
}
