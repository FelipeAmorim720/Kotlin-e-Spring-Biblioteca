package fundamentos

fun main() {
    val pessoa: Pessoa? = Pessoa("Felipe", 20)

    println(pessoa!!.nome)
}