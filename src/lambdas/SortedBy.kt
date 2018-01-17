package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")
    val ordenadosAsc = nomes.sortedBy { it }
    val ordenadosDesc = nomes.sortedByDescending { it }

    println("Ordenação crescente: $ordenadosAsc")
    println("Ordenação decrescente: $ordenadosDesc")


}