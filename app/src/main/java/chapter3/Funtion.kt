package chapter3

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/21
 * description  : var 和Val的区别
 */
class Funtion {
  // 不可变 和 JAVA的final（编译期常量）进行对比 看字节码，kotlin是运行时常量，编译期常量：(编译器在编译的时候就知道他是什么值了，)需要加 const val
  val FINAL_HELLO_WORLD: String = "HelloWorld"
  //可变
  var hellowWorld: String = "HelloWorld"

  // 类型推导 编译器能猜到的类型可以不要定义什么类型
  val FINAL_HELLO_CHINA = "HelloChina"

  //函数无返回值 unit可以不写
  fun main(args: Array<String>): Unit {
    println(sum(1, 3))
  }

  //返回值函数
  fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
  }

  //Lambda表达式
  val sum = { arg1: Int, arg2: Int -> arg1 + arg2 }

  val printLinHello = {
    println("Hello")
  }
}