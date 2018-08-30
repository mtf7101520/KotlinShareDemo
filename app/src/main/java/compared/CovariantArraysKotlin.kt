package compared

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/7/9
 * description  : 功能描述
 */
object CovariantArraysKotlin {

  @JvmStatic
  fun main(args: Array<String>) {
//    val fruits = arrayOfNulls<CovariantArraysKotlin.Apple>(10)
//    fruits[0] = CovariantArraysKotlin.Apple()
//    fruits[1] = CovariantArraysKotlin.AppleC()
//    try {
//      fruits[0] = CovariantArraysKotlin.Fruit()
//    } catch (e: Exception) {
//      println(e)
//    }
//
//    try {
//      fruits[0] = CovariantArraysKotlin.Orange()
//    } catch (e: Exception) {
//      println(e)
//    }

  }

  internal open class Fruit

  internal class AppleC : Apple()

  internal open class Apple : Fruit()

  internal class Orange : Fruit()
}
