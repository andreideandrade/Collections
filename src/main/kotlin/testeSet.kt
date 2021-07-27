package me.andrei.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val nailha = Funcionario("Nailha", 3100.0, "PJ")
    val maria = Funcionario("Maria", 1000.0, "CLT")

    val funcionario1 = setOf(joao, nailha)
    val funcionario2 = setOf(maria)

    println("-------------- Union ----------------")
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{ println(it)}

    println("-------------- Subtract --------------")

    val funcionario3 = setOf(joao, nailha, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)

    resultSubtract.forEach { println(it) }

    println("-------------- Intersect --------------")

    val resultIntersect = funcionario3.intersect(funcionario2)

    resultIntersect.forEach { println(it) }
}