package me.andrei.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val nailha = Funcionario("Nailha", 3100.0, "PJ")
    val maria = Funcionario("Maria", 1000.0, "CLT")

    val funcionarios = listOf(joao, nailha, maria)

    println("-------- List of ------------------")
    funcionarios.forEach { println(it) }

    println("--------- find -----------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-------- sortedBy ---------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("-------- groupBy ---------")
    funcionarios
        .groupBy { it.tipo }
        .forEach { println(it) }

}