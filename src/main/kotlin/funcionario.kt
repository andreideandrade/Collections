package me.andrei.collections

data class Funcionario(
    val nome : String,
    val salario : Double,
    val tipo: String
){
    override fun toString(): String =
        """
            Nome: $nome
            Salario: $salario
        """.trimIndent()
}
