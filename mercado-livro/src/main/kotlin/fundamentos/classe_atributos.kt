package fundamentos

class Carro(var cor: String, var anoFabricante: Int, val dono: Dono) {

}

class Dono(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Nome do monstro: ${nome} :: Idade do monstro ${idade}"
    }
}

fun main() {
    var carro = Carro("Branco", 2021, Dono("Felipe", 20))

    println(carro.cor)

    println("Mas quem é dono desse lindo carro? \n" + carro.dono)
}