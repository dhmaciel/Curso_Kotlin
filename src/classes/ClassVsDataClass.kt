package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    println(g1 == g2) // equivale a equals - false por que class nativamente nao implementa equals na classe

    val t1 = Televisao("Samsung", 32)
    val t2 = Televisao("Samsung", 32)

    println(t1 == t2) // dataclass - já implementa nativamente equals e compara os atributos.
    println(t1 === t2) // === compara endereço de memória.
    println(t1.toString()) // Dataclass já implementa o método toString() nativamente.
    println(t1.copy())
    println(t1.copy(polegadas = 42))

    // Destructuring em data class
    val(marca, pol) = t1 // Para fazer Destructuring a classe precisa ser data class.
    println("$marca $pol")





}
