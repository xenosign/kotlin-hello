package b_nullable

fun main() {
    // Safe call
    // ? 연산자를 사용해서 null 이면 뒤의 구문 실행 X, 대신 바로 null 을 리턴
    var str1: String? = "ABC";
    println(str1?.length);
    str1 = null;
    println(str1?.length);
    
    // Elvis 연산자, ?: -> 90도 돌리면 엘비스 프레슬리 머리 같아서 그렇다고 함
    // 마치 3항 연산자와 같이 앞의 값이 null 이면 : 뒤의 값을 넣어줌
    var str2: String? = "ABC";
    println(str2?.length ?: 0);
    str2 = null;
    println(str2?.length ?: 0);

    // nullable 이 명확하게 아닌지 표기하는 방법 -> !!
    println(startsWithA4("ABC")); // true
    println(startsWithA4(null)); // -> !! 연산자로 인해서 런타임 에러 발생, 컴파일 타임 X
}

// 리턴 타입에 null 이 불가능 -> ? 가 없음
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null 이 들어옴");
    }

    return str.startsWith("A");
}

fun startsWithA1Upgrade(str: String?): Boolean {
    // Elvis 연산자를 사용하여 간단하게 처리
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 들어옴");
}

// 리턴 타입에 null 이 가능 -> ? 가 있음
fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null;
    }

    return str.startsWith("A");
}

fun startsWithA2Upgrade(str: String?): Boolean? {
    return str?.startsWith("A");
}

// 리턴 타입에 null 이 불가능 -> ? 가 없음
fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false;
    }

    return str.startsWith("A");
}

fun startsWithA3Upgrade(str: String?): Boolean {
    return str?.startsWith("A") ?: false;
}

// nullable 이 아님을 명시하고 싶을 때 -> !!
fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A");
}

