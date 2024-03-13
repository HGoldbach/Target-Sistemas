import java.util.Scanner

fun main() {
    println("Número na sequência de Fibonacci")
    val reader = Scanner(System.`in`)
    print("Entre um número: ")

    try {
        val number = reader.nextInt()

        if(isFibonacci(number)) {
            println("O número $number está presente na sequência de fibonacci!")
        } else {
            println("O número $number não está presente na sequência de fibonnaci!")
        }
    } catch (e: Exception) {
        println("Entrada inválida. Um número inteiro deve ser digitado!")
    }

}

fun isFibonacci(numberToFind: Int) : Boolean {
    // variaveis auxiliares
    var t1 = 0
    var t2 = 1

    while (t1 <= numberToFind) {
        if (t1 == numberToFind) {
            return true
        }
        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

    return false
}


