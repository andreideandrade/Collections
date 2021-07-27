package me.andrei.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1 = mapOf(pair)


    println("------------------- map 1 ------------------------")
    map1.forEach { (t, u) -> println("Chave: $t - Valor: $u") }

    println("------------------- map 2 ------------------------")
    val map2 = mapOf(
        "Pedro" to 2500.0,  // -> to - é um recurso infix do kotlin
        "Maria" to 3000.0
    )
    map2.forEach { (t, u) -> println("Chave: $t - Valor: $u") }
}