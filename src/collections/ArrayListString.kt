package collections

fun main(args: Array<String>) {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for (item in strings) {
        //println(item.toUpperCase())
    }

    strings.forEach { println(it) } // Faz a mesma coisa do for

}