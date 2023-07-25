package com.ttasjwi.lec03

import java.time.LocalDate

/**
 * 문자열 내에서 ${변수}, $변수, Multiline string
 */
fun main() {
    val person = Person("땃쥐", 10)
    val day = LocalDate.of(2023,7,25)
    val log = "오늘은 $day 입니다. ${person.name}는 ${person.age}살 이네요."
    println(log)

    val multiLineString = """
        ${person.name}!!!
        땃고양이가 오고 있어!!!
        도망쳐!!!!
    """.trimIndent()
    println(multiLineString)
}
