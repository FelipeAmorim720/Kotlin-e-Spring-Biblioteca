package fundamentos

fun main() {

    var lista: List<Int?> = listOf(1, 2, 4, null, 8)
    var listaNullable: List<Int?>? = null

    var nome: String? = "Felipe"

    var tamanho: Int = nome?.length ?: 0 // elvis operator

    if (nome != null) {
        println(nome.length)
    }

    var toShort: Short = nome!!.length.toShort()

}