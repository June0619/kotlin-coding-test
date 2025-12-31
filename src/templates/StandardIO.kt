package templates

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    // 1. 첫 줄에 N, M이 주어지는 경우
    var st = StringTokenizer(br.readLine())
    val n = st.nextToken().toInt()
    val m = st.nextToken().toInt()

    print("%d %d\n".format(n, m))

    // 2. N번 반복하며 입력 받기
    repeat(n) {
        st = StringTokenizer(br.readLine())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        print("%d %d".format(a, b))
    }

}