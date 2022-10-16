package fundamentos

fun main() {
    var lista = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = lista.filter { it % 2 == 0 }.first()

    println("Printando apenas o primeiro numero da lista")
    println(pares)

    println("Printando todos os numeros da lista - For")
    for (numero in lista) {
        println(numero)
    }

    println("Printando todos os numeros da lista - ForEach")
    lista.forEach { println(it) }

    println("Quantidade de registros da lista")
    println(lista.size)

    println("Buscando por indice")
    println(lista.indexOf(4))

    var listaMutavel = mutableListOf(1, 3, 4, 5, 6, 7, 8, 31, 12) //Mutable permite criar uma lista mutavel, com metodos especiais

    println("Lista Mutavel")
    println(listaMutavel)

    println("Adicionando um valor novo na lista mutavel")
    listaMutavel.add(222)
    println(listaMutavel)

    println("Removendo valor de um index")
    listaMutavel.removeAt(0)
    println(listaMutavel)

    println("Removendo valor de um elemento")
    listaMutavel.remove(12)
    println(listaMutavel)

    println("Alterando valor do primeiro elemento")
    listaMutavel[0] = 15
    println(listaMutavel)

    println("Ordenando Lista")
    listaMutavel.sort() // ordena
    println(listaMutavel)

    println("Embaralhando Lista")
    listaMutavel.shuffle() // embaralha
    println(listaMutavel)

    println("setOf")
    var setNumeros = setOf(1, 2, 3, 2) // unifica valores, nao permitindo valores iguais
    println(setNumeros)


    // existe o mapOf e o mutableMapOf
    println("mapOf")
    var mapNomeIdade = mutableMapOf("Gabriela" to 18, "Felipe" to 20)
    println(mapNomeIdade)

    println("Adicionando um novo registro no mapOf")
    mapNomeIdade.put("Lavinia", 19)
    println(mapNomeIdade)

    mapNomeIdade["Lavinia"] = 18 // setando direto
    println(mapNomeIdade)

    mapNomeIdade.remove("Gabriela") // removenoo
    println(mapNomeIdade)

    mapNomeIdade.putIfAbsent("Felipe", 21)
    println(mapNomeIdade)

}