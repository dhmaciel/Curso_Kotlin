package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carolina")

    for (aluno in alunos) {
        println(aluno)
    }

    // Com indice
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} = $aluno")
    }
}