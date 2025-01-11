package h_function

fun main() {
    // named parameter
    // 사용하고 싶은 파라미터를 직접 지정해서 전달 가능, 빌더 패턴의 장점을 사용 가능
    // 단 자바의 메서드를 가져와서 사용할 경우에는 named parameter 사용 불가능
    repeat("Hello, world!", 3, true);
    repeat("Hello, world!", useNeline = false);
    
    // 배열을 전개로 뿌리고 싶을 때는 * 사용
    printAll("A", "B", "C");

    val arr = arrayOf("A", "B", "C");
    printAll(*arr);
}

// 원본 함수
fun max1(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
};

// 리턴의 경우 = 를 통해 {} + return 없이 사용이 가능
fun max2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    };

// 타입 추론이 가능하므로 함수의 리턴 타입 및 {} 생략 가능
fun max3(a: Int, b: Int) = if (a > b) a else b;

// default parameter
// 자바의 경우 파마미터 수에 따른 함수 실행을 다르게 하기 위해서는 총 3개의 메서드 오버로딩을 해줘야 함
// 코틀린의 경우 default parameter 를 사용하여 하나의 메서의 정의를 통해 해결 가능
fun repeat(str: String, num: Int = 3, useNeline: Boolean = true) {
    for (i in 1..num) {
        if (useNeline) {
            println(str);
        } else {
            print(String);
        }
    }
}

// 가변인자 사용, 자바의 ... 과 달리 vararg 사용
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str);
    }
}