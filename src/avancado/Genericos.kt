package avancado

import funcoes.adicionar

class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>()

    init {
        adicionar(objeto)
    }

    fun adicionar(novoObjeto: T) {
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main(args: Array<String>) {
    val materialEsolar = Caixa("Caneta")
    materialEsolar.adicionar("Lapis")
    materialEsolar.adicionar("Borracha")
    println(materialEsolar)

    val numeros = Caixa(objeto = 1)
    numeros.adicionar(3)
    println(numeros)
}