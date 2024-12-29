package e_conditional

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) throw IllegalArgumentException("${score} 는 양수여야 합니다!")
}

fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P";
    } else {
        return "F";
    }
}

// 자바에서 if 는 Statement 지만 코틀린에서 if 는 Expression 이다
// 따라서 if 문 자체를 변수에 할당 하거나 리턴 값에 if 문을 넣어 줄 수 있음
fun getPassOrFail2(score: Int): String {
    return if (score >= 50) {
        "P";
    } else {
        "F";
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A";
    } else if (score >= 80) {
        "B";
    } else {
        "C";
    }
}

// in 과 .. 를 사용하면 간단하게 표현 가능
fun isScoreInHundred(score: Int): String {
    // if (0 <= score && score <= 100) 과 같음
    return if (score in 0..100) {
        "${score} 는 0 ~ 100 사이의 숫자 입니다";
    } else {
        "${score} 는 0 ~ 100 사이의 숫자가 아닙니다";
    }
}

// switch 는 when 으로 대체된다
fun getGradeWithSwitch(score: Int): String {
    return when(score / 10) {
        in 90..99 -> "A";
        in 80..89 -> "B";
        77 -> "Lucky";
        in 70..79 -> "C";
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A");
        else -> false;
    }
}

fun judgeNumber(number: Int) {
    when(number) {
        1, 0, -1 -> println("1 ~ -1 사이의 정수");
        else -> println("1 ~ -1 사이의 정수가 아닙니다");
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0");
        number % 2 == 0 -> println("짝수");
        else -> println("홀수")
    }
}