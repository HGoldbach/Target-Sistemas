import java.lang.StringBuilder
import java.util.Scanner

fun main() {
    println("Inversor de String")
    val reader = Scanner(System.`in`)

    print("Entre uma ou mais palavras: ")
    val word = reader.nextLine()
    val wordInverted = stringInverter(word)
    println("Palavra invertida = $wordInverted")
}

fun stringInverter(word: String): String {
    val result: StringBuilder = StringBuilder()
    for(i in word.length-1 downTo 0) {
        result.append(word[i])
    }
   return result.toString()
}
