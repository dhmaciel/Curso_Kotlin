package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = null
    var obrigatorio: String = opcional ?: "Valor Padrão"

    println(obrigatorio)
}