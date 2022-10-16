package fundamentos

class MinhaClasse(
        var nome: String,
        var endereco: String,
        var idade: Int
) {
    companion object {
        fun criaClasse(): MinhaClasse {
            return MinhaClasse("Felipe", "Rua Teste", 20)
        }
    }
}

class SegundaClasse(
        var nome: String,
        var endereco: String,
        var idade: Int
) {
    fun criaClasse(): SegundaClasse {
        return SegundaClasse("Felipe", "Rua Teste", 20)
    }
}

fun main() {
    var segundaClasse = SegundaClasse("Felipe", "Rua Teste", 20).criaClasse() // maneira incorreta

    var minhaClasse = MinhaClasse.criaClasse()
}