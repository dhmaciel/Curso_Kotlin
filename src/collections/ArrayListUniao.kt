package collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafel", "Ana", "Joaquim", "Luna", "Lela")
    val uniao = numeros + strings

    uniao.forEach { println(it) }

}