package com.ttasjwi.lec03

/**
 * 03-01 : 기본타입
 */
fun main() {
    val number1 = 3 // Int
    val number2 = 3L // Long
    val number3 = 3.0f // Float
    val number4 = 3.0 // Double
    println("number1 = $number1, number2 = $number2, number3 = $number3, number4 = $number4")


    val number5 = 4
    // val number6: Long = number1 :: Type mismatch
    val number6: Long = number4.toLong() // 명시적으로 .to변환타입() 을 호출해서 형변환해야한다
    println("number5 = $number5, number6 = $number6")

    val number7 = 3
    val number8 = 5
    val result = number7 / number8.toDouble() // 명시적 형변환이 필요하다
    println("number7 = $number7, number8 = $number8 --> number7/number8 = $number7/$number8 = $result")

    val number9: Int? = 3
    val number10: Long = number9?.toLong() ?: 0L // 변수가 nullable 이라면 적절한 처리가 필요하다는 것이 강제됨
    println("number9 = $number9, number10 = $number10")
}
