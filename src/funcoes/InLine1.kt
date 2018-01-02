package funcoes

inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    }finally {
        println("fechando transação")
        println()
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 2...")
    }
    // Forma alternativa de função inline:
    transacao() {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 2...")
    }
    // Forma alternativa de função inline:
    transacao( {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 2...")
    } )

}