package g_exception

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile();
}

fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt();
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다")
    }
}

// try, catch 도 expression 으로 사용이 가능하다
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt();
    } catch (e: NumberFormatException) {
        null
    }
}

// Kotlin 에서는 전부  Unchecked Exception 만 존재, 명시적으로 throws 를 해주지 않아도 된다
fun readFile() {
    val currentFile = File(".");
    val file = File(currentFile.absolutePath + "/a.txt");
    val reader = BufferedReader(FileReader(file));
    println(reader.readLine());
    reader.close();
}

// Kotlin 에서는 try with resources 구문이 존재하지 않는다
// use 라는 별도의 문법을 사용하여 처리한다, inline 확장 함수임
fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine());
    }
}
