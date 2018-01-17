package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    val alunos = arrayListOf(
            Aluno("Pedro", 7.4),
            Aluno("Maria", 8.0),
            Aluno("Sara", 4.3),
            Aluno("Sebastião", 4.1),
            Aluno("Alice", 9.7)
    )

    val aprovados = alunos.filter { it.nota >= 7.0 }.sortedBy { it.nome }
    val reprovados = alunos.filter { it.nota < 7.0 }.sortedBy { it.nome }

    println("Alunos aprovados: $aprovados")
    println("Alunos reprovados: $reprovados")
}