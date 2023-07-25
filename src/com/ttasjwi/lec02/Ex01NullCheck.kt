package com.ttasjwi.lec02

import java.lang.IllegalArgumentException


class Ex01NullCheck {

    fun startsWithA1(str: String?): Boolean {
        if (str == null) {
            throw IllegalArgumentException("null이 들어왔습니다.")
        }
        return str.startsWith("A")
    }

    fun startsWithA2(str: String?): Boolean? {
        if (str == null) {
            return null
        }
        return str.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
        // return str.startsWith("A") // null이 발생할 여지가 있는 부분에서 null 처리를 안 하면 null 처리를 하라고 컴파일 에러를 발생시킨다.
        if (str == null) {
            return false
        }
        return str.startsWith("A")
    }

}


fun main() {
    val ex = Ex01NullCheck()
    try {
        ex.startsWithA1(null)
    } catch (e: Exception) {
        println("result1 => [예외 발생] ${e.message}")
    }

    val result2 = ex.startsWithA2(null)
    println("result2 = ${result2}")

    val result3 = ex.startsWithA3(null)
    println("result3 = ${result3}")
}
