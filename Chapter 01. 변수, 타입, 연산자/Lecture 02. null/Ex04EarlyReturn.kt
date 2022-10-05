fun main() {
    val number: Long? = null
    val result: Long = calculate(number)
    print(result)
}

fun calculate(number: Long?): Long {
    number ?: return 0
    // 다음 로직
    return number * 2
}
