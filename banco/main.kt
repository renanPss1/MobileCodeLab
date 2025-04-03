import java.util.Scanner

class CaixaEletronico {
    var saldo = 0.0
    val scanner = Scanner(System.`in`)

    fun iniciar() {
        var continuar = true
        // Loop principal para mostrar o menu até o usuário escolher sair
        while (continuar) {
            mostrarMenu()
            when (scanner.nextLine()) {
                "1" -> realizarSaque()
                "2" -> realizarDeposito()
                "3" -> mostrarSaldo()     
                "4" -> { 
                    println("Saindo... Até logo!") 
                    continuar = false // Opção para sair
                }
                else -> println("Opção inválida. Tente novamente.") 
            }
        }
    }

    // Função que exibe o menu de opções
    private fun mostrarMenu() {
        println("\n===== MENU =====")
        println("1 - Sacar")
        println("2 - Depositar")
        println("3 - Ver Saldo")
        println("4 - Sair")
        println("================")
    }

    // Função para realizar o saque
    private fun realizarSaque() {
        print("Digite o valor para sacar: ")
        val valor = scanner.nextDouble()
        scanner.nextLine() // Limpa o buffer
        if (valor > saldo) {
            println("Saldo insuficiente!") 
        } else if (valor <= 0) {
            println("Valor inválido para saque!")
        } else {
            saldo -= valor
            println("Saque de R$ $valor realizado com sucesso!") 
        }
    }

    // Função para realizar o depósito
    private fun realizarDeposito() {
        print("Digite o valor para depositar: ")
        val valor = scanner.nextDouble()
        scanner.nextLine() // Limpa o buffer
        if (valor <= 0) {
            println("Valor inválido para depósito!")
        } else {
            saldo += valor
            println("Depósito de R$ $valor realizado com sucesso!")
        }
    }

    // Função para mostrar o saldo atual
    private fun mostrarSaldo() {
        println("Saldo atual: R$ $saldo")
    }
}

fun main() {
    val caixa = CaixaEletronico()
    caixa.iniciar() // Inicia o caixa eletrônico
}
