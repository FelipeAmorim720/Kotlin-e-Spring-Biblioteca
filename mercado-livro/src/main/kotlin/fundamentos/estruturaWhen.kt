package fundamentos

fun main() {
    val x = 17

    when (x) {
        5 -> println("x == 5")
        8 -> println("x == 8")
        13 -> println("x == 13")
        in 10..20 -> println("Número está entre 10 e 20")
        else -> println("Número não mapeado")

    }

    when {
        startedWithOne("oi, tudo bem?") -> println("Opa, deu certo!")
    }

}

fun startedWithOne(x: Any): Boolean {
    return when (x) {
        is String -> x.startsWith("oi")
        else -> false
    }
}