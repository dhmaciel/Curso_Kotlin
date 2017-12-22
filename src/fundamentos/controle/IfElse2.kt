package fundamentos.controle

fun main(args: Array<String>) {
    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if (num1 > num2){
        println("processando1...")
        num1
    } else {
        println("processando2...")
        num2
    }

    val maiorValor2 = if (num1 > num2) num1 else num2 //Outra forma + simples.

    println("O maior valor é $maiorValor")

    println("O maior valor2 é $maiorValor2")
}