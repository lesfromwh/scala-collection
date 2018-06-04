package com.ls.collectiondemo.seq

/**
  * @author liushuang 2018/5/31
  */
object SeqPartialDemo {
  def main(args: Array[String]): Unit = {
    val s1 = Seq(1 to 5: _*)
    val s2 = Seq(6 to 10: _*)
    val s3: PartialFunction[Int, String] = {
      case x if x > 0 => "hello" + x
    }

    //    println(s1.asInstanceOf[PartialFunction[Int, Int]]) //List(1, 2, 3, 4, 5)

    println(s1.andThen(s2)(2)) // s2(2) = 9
    println(s1.andThen(s3)(2)) //hello3
    println(s1.applyOrElse(2, (_: Int) => 100)) // s1(2) =3
    println(s1.applyOrElse(10, (_: Int) => Int.MaxValue)) //2147483647

    //orElse 用来组合偏函数
    println(s1.orElse(s2)(2)) // s1(2)=3   2在s1的定义域上,所以不会使用偏函数
    println(s1.orElse(s3)(8)) //"hello8" = s3(8)

    //lift将偏函数转换成一个普通函数.
    println(s1.lift(2)) //Some(3)
    println(s1.lift(8)) //None

    val stringToInt = s1.compose((x: String) => x.length - 1)
    println(stringToInt) //scala.Function1$$Lambda$12/434091818@17c68925

    //compose 与andThen区别 compose是先调用这个函数,在应用序列得到元素
    println(s1.compose((x: String) => x.length - 1)("hello")) // s(4) =5

    //?
    println(s1.runWith(println)(2)) //true
    println(s1.runWith(println)(8)) //false
  }
}
