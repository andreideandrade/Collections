package me.andrei.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val nailha = Funcionario("Nailha", 3100.0, "PJ")
    val maria = Funcionario("Maria", 1000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("-------------add---------------------")
    funcionarios.add(nailha)
    funcionarios.forEach { println(it) }

    println("-------------remove---------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("--------------set--------------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("--------------set add--------------------")
    funcionariosSet.add(nailha)
    funcionariosSet.add(maria)
    funcionariosSet.forEach { println(it) }

    println("--------------set remove--------------------")
    funcionariosSet.remove(maria)
    funcionariosSet.forEach { println(it) }

}