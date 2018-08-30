package com.example.maotongfei.kotlindemo

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/18
 * description  : 智能类型转换
 */
class TypeCastKotlin {
  open class Parent
  class Child : Parent()


  val parent: Parent = Parent()
  //类似于java的类型转换，失败则抛异常, Kotlin失败则返回null，不抛出异常
  val child: Parent? = parent as? Child
}