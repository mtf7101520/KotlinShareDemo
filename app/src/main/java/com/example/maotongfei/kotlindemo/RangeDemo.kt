package com.example.maotongfei.kotlindemo

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/18
 * description  : 区间
 */
class RangeDemo {
  //都是闭区间
  val range: IntRange = 0..1024//[0,1024]

  val rangerR: IntRange = 0 until 1024 //区别半开区间[0,1024） =[0,1023]

  val emptyRange: IntRange = 0..-1


  fun main() {
    //遍历一个区间，比如：可以用 step 关键字来决定每次遍历时候的跳跃幅度：
    for (i in 1..4 step 2) {
      //do
    }

    //也可以逆向迭代，或者逆向遍历并且控制每次的 step：
    for (i in 4 downTo 1 step 2) {
      //do
    }

    print(emptyRange.isEmpty())

    //两种写法
    print(range.contains(50))

    print(50 in range)
  }


}