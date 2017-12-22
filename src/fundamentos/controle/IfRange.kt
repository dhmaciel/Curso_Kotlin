package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 8.99

    //Usando operador range
    if (nota in 9..10){
        println("Fantastico")
    } else if(nota in 7..8){
        println("Parabens")
    } else if(nota in 4..6){
        println("Tem como recuperar")
    } else if(nota in 0..3){
        println("Te vejo no proximo semestre")
    } else {
        println("Nota inválida")
    }

    println(5 in 7..4)
    println(5 in 4..7)
}