package collections

fun main(args: Array<String>) {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    //aprovados.add(1)

    println("Sem Ordem...")
    for (aprovado in aprovados){
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    aprovadosNaOrdem1.forEach { it.print() }


    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nSorted...")
    aprovadosNaOrdem2.forEach { it.print() }

    //Ordem maluca...
    aprovados.sortedBy { it.substring(1) }.print()



}