package com.example.maotongfei.kotlindemo

/**
 * author       : maotongfei
 * email        : maotongfei@corp.netease.com
 * date         : 2018/5/18
 * description  : 空安全
 */
class NullSafe {

  //？可空
  fun getName(): String? {
    return null
  }

  fun main() {
    //String默认是不为空的所以不能赋值为空
//    val notNull: String = null

    //加"?"即可为空
    val nullable: String? = null

    //肯定不为空，可以直接调用
//    notNull.length

    //"?"判断签名是否为空，为空则return，类似三目
    val name = getName() ?: return
    print(name.length)

    //可空的情况，！！强制告诉编织器相信
    val myName: String? = "hhaha"
    print(myName!!.length)
    print(myName.length)
  }
}
