package com.example.maotongfei.kotlindemo

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/18
 * description  : 类
 */
//构造方法直接放在类名
class ClassDemo(var name: String, var title: String):Man() {

  private val mName: String = name
  private val mTitle: String = title
  //Kotlin的构造方法的方法体
  init {
  }

  constructor(name: String) : this(name, "ts")

  override fun toString(): String {
    return "ClassDemo(name='$name', title='$title')"
  }

}
//open打开可继承
open class Man

// 第一种
//class Person {
//  private val mName: String
//  private val mAge: Int
//
//  constructor(name: String, age: Int) {
//    this.mName = name
//    this.mAge = age
//  }
//
//  constructor(name: String) {
//    this.mName = name
//    this.mAge = 0
//  }
//}

//第二种
//class Person {
//  private val mName: String
//  private val mAge: Int
//
//  constructor(name: String, age: Int) {
//    this.mName = name
//    this.mAge = age
//  }
//
//  constructor(name: String) : this(name, 0)
//}

//第三种
//class Person(name: String, age: Int) {
//  private val mName: String
//  private val mAge: Int
//
//  init {
//    this.mName = name
//    this.mAge = age
//  }
//
//  constructor(name: String) : this(name, 0)
//}

//最后
//class Person(name: String, age: Int) {
//  private val mName: String = name
//  private val mAge: Int = age
//
//  constructor(name: String) : this(name, 0)
//}

