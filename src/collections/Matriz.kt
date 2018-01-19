package collections

fun main(args: Array<String>) {
    val matriz = Array(3) { arrayOfNulls<Int>(3)}

    matriz[0][0] = 1
    matriz[0][1] = 1
    matriz[0][2] = 1
    matriz[1][0] = 1
    matriz[1][1] = 1
    matriz[1][2] = 1
    matriz[2][0] = 1
    matriz[2][1] = 1
    matriz[2][1] = 1
    matriz.get(2).set(2, 9) // Alternativa a setar matriz

    for ((linha, linhaArray) in matriz.withIndex()) {
        for ((coluna, valor) in linhaArray.withIndex()) {
            println("[$linha][$coluna] = ${matriz[linha][coluna]} == $valor")
        }
    }

    matriz.forEach { linha ->
        linha.forEach { valor ->
            println(valor)
        }
    }
}