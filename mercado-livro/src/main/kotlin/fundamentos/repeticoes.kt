package fundamentos

fun main() {
//    limit10()
//    reverse()
//    printPar()
//    printRange(50, 200)
    whileMenorQue10()
}

fun limit10() {
    for (numero in 1..10) {
        println(numero)
    }
}

fun reverse() {
    for (numero in 10 downTo 1) {
        println(numero)
    }
}

fun printPar() {
    for (numero in 2..10 step 2) {
        println(numero)
    }
}

fun printRange(inicio: Int, fim: Int) {
    for (numero in inicio..fim) {
        println(numero)
    }
}

fun whileMenorQue10() {
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}