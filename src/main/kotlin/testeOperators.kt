package me.andrei.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){  println(salario) }

    println("----------- max - min - average -------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("------------ filter --------------------")
    val salarioMaiorQue2500 = salarios.filter { it > 2500.0 }
    salarioMaiorQue2500.forEach { println(it) }

    println("------------ count --------------------")
    println(salarios.count{ it in 2000.0..5000.0})

    println("------------ find --------------------")
    println(salarios.find{ it == 2250.0})

    println("------------ any --------------------")
    println(salarios.any{ it == 2250.0})
}