fun main() {
    val result = startsWith("ABC")
    print(result)
}

fun startsWith(str: String?) : Boolean {
    return str!!.startsWith("A") // Null 아님 단언

    // 근데, 정말 Null 들어오면 NullPointerException 발생함
}
