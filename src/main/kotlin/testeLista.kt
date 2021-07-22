package me.andrei.collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val nailha = Funcionario("Nailha", 2000.0)
    val maria = Funcionario("Maria", 3000.0)

    val funcionarios = listOf(joao, nailha, maria)

    funcionarios.forEach { println(it) }

    println("--------------------------")
    println(funcionarios.find { it.nome == "Maria" })
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