package me.andrei.collections

fun main() {
    /*  Declarando com Array */
    val nome = Array(3) { "" }

    nome[0] = "Maria";    nome[1] = "Abadio";    nome[2] = "José";

    println("Usando variaveis: ")
    for (nomes in nome) { println(nomes) }

    println("\n=============================\n")
    println("Usando forEach e lambda 'it': ")

    nome.sort()
    nome.forEach { println(it) }

    /*  Declarando com arrayOf */
    println("\n=============================\n")
    println("Usando arrayOf e forEach: ")

    val nome2 = arrayOf("Leudralita", "Tarbelina", "Disconsonario")

    nome2.sort()
    nome2.forEach { println(it) }

}
