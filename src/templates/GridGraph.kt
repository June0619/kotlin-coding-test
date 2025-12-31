package templates

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st = StringTokenizer(br.readLine())

    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    // 공백 없이 입력되는 경우
    // 3 3
    // 110
    // 001
    // 110
    val map1 = Array(N) {
        br.readLine().toCharArray()
    }

    println(map1.contentDeepToString())

    // 공백으로 구분되는 경우
    // 1 1 0
    // 0 0 1
    // 1 1 0
//    val map2 = Array(N) {
//        st = StringTokenizer(br.readLine())
//        IntArray(M) {
//            st.nextToken().toInt()
//        }
//    }
//
//    println(map2.contentDeepToString())
}