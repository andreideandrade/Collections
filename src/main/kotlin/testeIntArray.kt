package me.andrei.collections

fun main() {

    val values = IntArray(5)

    values[0] = 9
    values[1] = 1
    values[2] = 6
    values[3] = 2
    values[4] = 7

    println("for usando variaveis: ")
    for (valor in values){  print(" ${valor} ")   }

    values.sort()   // Organiza matriz em ordem crescente

    println("\nforEach (Usa função lambda 'it') com sort: ")
    values.forEach {  print(" ${it} ")    }

    println("\nforEach (Usando variavel 'valor') com sort: ")
    values.forEach {  valor -> print(" ${valor} ")    }

    println("\nfor usando index: ")
    for (index in values.indices){ print(" ${values[index]} ") }
}