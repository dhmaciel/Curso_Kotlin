package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(10020030040, "João")
    map.put(10020040050, "Maria")
    map.put(10020050060, "Lucas")


    map.put(10020030040, "João Filho")

    for (par in map) {
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(10020050060)?.print()
    map[10020050060]?.print()
    map.contains(10020050060).print()
    map.remove(10020050060)?.print()
    map.clear()
    map.isEmpty().print()

}