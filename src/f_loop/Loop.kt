package f_loop

fun main() {
    // foreach
    // : 대신 in 사용
    val numbers = listOf(1, 2, 3);    
    for (number in numbers) {
        println(number);
    }

    // for
    // 인덱싱에 변수 선언 필요 없음
    for (i in 1..3) {
        println(i);
    }

    for (i in 3 downTo 1) {
        println(i);
    }

    for (i in 1..5 step 2) {
        println(i);
    }

    for (i in 5 downTo 1 step 2) {
        println(i);
    }
    
    // while, 정확히 동일
    var i = 1;
    while (i <= 3) {
        println(i);
        i++;
    }
}