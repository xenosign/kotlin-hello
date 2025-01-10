package g_exception

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main() {
    readFile();
}

/**
 * 문자열을 정수로 변환하는 함수
 * 변환 실패시 커스텀 예외 메시지를 포함한 IllegalArgumentException을 발생시킴
 * @throws IllegalArgumentException 문자열이 숫자 형식이 아닐 경우
 */
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt();
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다")
    }
}

/**
 * 문자열을 정수로 변환하는 함수
 * Kotlin에서는 try-catch를 표현식으로 사용 가능
 * 변환 실패시 null을 반환
 * @return 변환된 정수 또는 실패시 null
 */
fun parseIntOrThrow2(str: String): Int? {
    return try {
        str.toInt();
    } catch (e: NumberFormatException) {
        null
    }
}

/**
 * 파일을 읽는 기본 함수
 * Java와 달리 Kotlin은 Checked Exception을 강제하지 않음
 * 모든 예외가 Unchecked Exception으로 처리됨
 */
fun readFile() {
    val currentFile = File(".");
    val file = File(currentFile.absolutePath + "/a.txt");
    val reader = BufferedReader(FileReader(file));
    println(reader.readLine());
    reader.close();
}

/**
 * 리소스를 자동으로 닫아주는 함수
 * Java의 try-with-resources 대신 use 함수를 사용
 * use는 Closeable 인터페이스를 구현한 객체에 대해 사용 가능한 확장 함수
 * 블록 실행 후 자동으로 close() 호출
 */
fun readFile2(path: String) {
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine());
    }
}