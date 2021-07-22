package me.andrei.collections

fun main() {
    val values = intArrayOf(2,0,150,10,3,25)

    /*  Mostra lista em lista na sequencia normal       */
    println("\nLista sem ordenação: ")
    values.forEach { print(" ${it} ") }

    /*  Mostra lista ordenado usando 'sort' e forEach   */
    println("\nLista com ordenação: ")
    values.sort()
    values.forEach { print(" ${it} ") }
}