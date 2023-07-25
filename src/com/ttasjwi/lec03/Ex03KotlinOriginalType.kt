package com.ttasjwi.lec03

import java.lang.IllegalStateException
import java.time.LocalDate

/**
 * 코틀린의 특이한 타입 3개
 * <ul>
 *     <li>Any : Object에 대응</li>
 *     <li>Unit : void에 대응되는 개념. 그 자체로 타입의 인자로 사용 가능(실제 존재하는 타입이라는 뜻) </li>
 *     <li>Nothing : 함수가 정상적으로 끝나지 않음</li>
 * </ul>
 */
fun main() {

    // Any
    val str1 = "사람"
    val str2 = "사람"
    println("str1($str1) == str2($str2) ? -> ${str1 == str2}") // equals
    println("str1.hashCode = ${str1.hashCode()}")
    println("str2.hashCode = ${str1.hashCode()}") // hashcode

    val date1 = LocalDate.of(2023,3,1)
    val date2 = LocalDate.of(2023,3,1)
    println("date1.toString() -> ${date1.toString()}")
    println("date2.toString() -> ${date2.toString()}") // toString

    // Unit
    val unit: Unit = println("갸오")

    // nothing
    fail("으앙")
}

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}
