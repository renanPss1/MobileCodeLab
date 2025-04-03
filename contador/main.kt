fun main() {
    var contador = 0

    // Exibição inicial do contador
    println("Contador inicial: $contador")
    println("Digite 'a' para aumentar, 'd' para diminuir e 's' para sair.")

    // Loop para interação contínua
    while (true) {
        val input = readLine() // Espera pela entrada do usuário

        when (input) {
            "a" -> {
                contador++
                println("Contador aumentado: $contador")
            }
            "d" -> {
                contador--
                println("Contador diminuído: $contador")
            }
            "s" -> {
                println("Saindo... Valor final do contador: $contador")
                break
            }
            else -> {
                println("Entrada inválida. Tente novamente.")
            }
        }
    }
}
