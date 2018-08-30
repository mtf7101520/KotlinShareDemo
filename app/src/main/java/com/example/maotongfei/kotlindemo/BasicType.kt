package com.example.maotongfei.kotlindemo

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/18
 * description  : Kotlin BasicType
 */
class BasicType {
  val aBoolean: Boolean = true
  val anotherBoolean: Boolean = false

  val anInt: Int = 8
  val anotherInt: Int = 0xFF
  val moreInt: Int = 0b00000011
  val maxInt: Int = Int.MAX_VALUE
  val minInt: Int = Int.MIN_VALUE

  val aLong: Long = 1238417239184
  val another: Long = 123
  val maxLong: Long = Long.MAX_VALUE
  val minLong: Long = Long.MIN_VALUE

  val aFloat: Float = 2.0F
  val anotherFloat: Float = 1E3f
  val maxFloat: Float = Float.MAX_VALUE
  val minFloat: Float = Float.MIN_VALUE

  val aDouble: Double = 3.0
  val anotherDouble: Double = 3.1415926
  val maxDouble: Double = Double.MAX_VALUE
  val minDouble: Double = Double.MIN_VALUE

  val aShort: Short = 127
  val maxShort: Short = Short.MAX_VALUE
  val minShort: Short = Short.MIN_VALUE

  val aByte: Byte = 23
  val minByte: Byte = Byte.MIN_VALUE
  val maxByte: Byte = Byte.MAX_VALUE

  val aChar: Char = 'd'

  val string: String = "Hello World"
  val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o'))
  //加$相当于打印该变量的值
  val rawString: String = """
    $minByte
    dasd
    dad
    fadfa
    asd
    """

  fun main() {
    //字符串比较

    val test: String = "test str"
    //val：只读变量，相当于final
    //var：可变变量
    val compair: String = "compair"
    //"=="类似java 的equals

    var compairBooelan: Boolean = test == compair

    //"==="表示比较对象是否相同
    compairBooelan = test === compair
  }
}