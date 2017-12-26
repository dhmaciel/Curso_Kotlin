package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    println("Banana" === "Banana")

    val d1 = Date(0)
    val d2 = Date(0)

    //Igualdade referencial
    println("Resultado com '===' ${d1 === d2}")

    //Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
    //println("Resultado com '==' ${d1.equals(d2)}")
}