package me.andrei.collections

fun main() {
    val joao = Funcionario("João", 2000.0)
    val nailha = Funcionario("Nailha", 3100.0)
    val maria = Funcionario("Maria", 1000.0)

    val funcionarios = listOf(joao, nailha, maria)

    funcionarios.forEach { println(it) }

    println("--------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("-------- sortedBy ---------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

}

data class Funcionario(
    val nome : String,
    val salario : Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}