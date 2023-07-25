package com.ttasjwi.lec03

fun main() {
    val person = Person("땃쥐", 10)
    val nullPerson = null

    printAgeIfPerson1(person)
    printAgeIfPerson2(nullPerson)
}

fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) {
        // val person = obj as Person // 객체의 타입 캐스팅
        // println(person.age)

        // 스마트 캐스트 : 코틀린 컴파일러가 위의 if 문을 보고 타입을 간주해줌
        println(obj.age)
    }

    if (obj !is Person) { // 부
        println("사람이 아니야")
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person // Person -> Person, Person 아님 -> null, null -> null
    println(person?.name ?: "이름 없음")
}
