package templates

import java.io.StreamTokenizer

// 정수만으로 이루어져있고 입력이 많은 경우 (10만 이상)
fun main() = with(StreamTokenizer(System.`in`.bufferedReader())) {

    fun nextInt(): Int {
        nextToken()
        return nval.toInt()
    }

    val sb = StringBuilder()

    val n = nextInt()

    println("n = %d".format(n))

    repeat(n) {
        val a = nextInt()
        val b = nextInt()
        sb.append("a = %d, b = %d\n".format(a, b))
    }

    print(sb)
}