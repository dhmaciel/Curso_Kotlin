package fundamentos.funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray{
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordenar(38, 55, 6, 8, 581, 328, 96, 487, 123, 2, 5204, a = 1))
        print("$n ")
}