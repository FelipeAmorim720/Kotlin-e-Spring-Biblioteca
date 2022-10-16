package fundamentos

fun retornaNumeroExtenso(numero: Int): String {

    if (numero == 5) {
        return "Cinco"
    } else if (numero == 6) {
        return "Seis"
    }
    return "Número não mapeado"

}

fun main() {
    println(retornaNumeroExtenso(6))
}