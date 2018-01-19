package collections

class Objeto(val nome: String, val descricao: String) {
    override fun hashCode(): Int {
        return nome.length
    }

   /* override fun equals(other: Any?): Boolean {
        if (other is Objeto) {
            return nome.equals(other.nome, ignoreCase = true)
        }

        return false
    }*/

    override fun equals(other: Any?) = if (other is Objeto) {
        nome.equals(other.nome, ignoreCase = true)
    } else {
        false
    }
}

fun main(args: Array<String>) {
    val conjunto = hashSetOf(
            Objeto("Cadeira", "..."),// HashCode = 7
            Objeto("Mesa", "..."),// HashCode = 4
            Objeto("Faca", "..."),// HashCode = 4
            Objeto("Copo", "..."),// HashCode = 4
            Objeto("Bala", "...")// HashCode = 4
    )

    conjunto.contains(Objeto("faca", descricao = "????")).print()
}