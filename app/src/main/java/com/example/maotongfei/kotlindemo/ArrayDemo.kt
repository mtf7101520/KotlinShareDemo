package com.example.maotongfei.kotlindemo

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/21
 * description  : 功能描述
 */
class ArrayDemo {
  val arrayOfInt: IntArray = intArrayOf(1, 3, 5)
  val arrayOfChar: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o')
  val arrayOfString: Array<String> = arrayOf("我", "是", "码", "农")
  val arrayOfClassDemo: Array<ClassDemo> = arrayOf(
      ClassDemo("test", "title"), ClassDemo("test2", "title2"))

  fun main(args: Array<String>) {
    println(arrayOfInt.size)
    for (int in arrayOfInt) {
      println(int)
    }

    println(arrayOfClassDemo[1])

    //将字节拼接
    println(arrayOfChar.joinToString { "" })
    //数组 截取，类似indexof
    arrayOfInt.slice(1..2)

    //调取java
    JavaMethod.javaMethod()
  }
}