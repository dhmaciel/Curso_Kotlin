package fundamentos.controle

fun main(args: Array<String>) {
    // For bem diferente...
    val alunos = arrayListOf("André", "Juca", "Rita")
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice + 1} - $aluno")
    }
}