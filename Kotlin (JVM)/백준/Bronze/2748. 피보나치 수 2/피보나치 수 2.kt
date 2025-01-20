fun fibonacci(n: Int): Long {
    if (n == 0) return 0
    if (n == 1) return 1

    var a = 0L
    var b = 1L
    for (i in 2..n) {
        val temp = a + b
        a = b
        b = temp
    }
    return b
}

fun main() {
    val n = readLine()?.toIntOrNull()
    if (n != null && n in 0..90) {
        println(fibonacci(n))
    } else {
        println("올바른 0 이상 90 이하의 정수를 입력하세요.")
    }
}