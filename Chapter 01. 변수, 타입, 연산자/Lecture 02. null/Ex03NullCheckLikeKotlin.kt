import java.lang.IllegalArgumentException

fun main() {
    val ex = Ex03NullCheckLikeKotlin();
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

class Ex03NullCheckLikeKotlin {

    fun startsWithA1(str: String?): Boolean {
        return str?.startsWith("A")
            ?: throw IllegalArgumentException("null이 들어왔습니다.")
    }

    fun startsWithA2(str: String?): Boolean? {
        return str?.startsWith("A")
    }

    fun startsWithA3(str: String?): Boolean {
        return str?.startsWith("A") ?: false
    }

}
