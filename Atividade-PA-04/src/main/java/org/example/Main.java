package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de opções
        System.out.println("Escolha o metodo de pagamento");
        System.out.println("1. Pix");
        System.out.println("2. Cartão de crédito");
        System.out.println("3. Boleto");

        // Obtém a escolha do usuário
        int choice = scanner.nextInt();

        // Solicita o valor da transação
        System.out.println("Digite o valor da transacao: R$");
        double amount = scanner.nextDouble();


        // Cria a estratégia com base na escolha do usuário
        PaymentStrategy paymentStrategy = null;
        switch (choice) {
            case 1:
                paymentStrategy = new PixPayment();
                break;
            case 2:
                paymentStrategy = new CreditCardPayment();
                break;
            case 3:
                paymentStrategy = new BoletoPayment();
                break;
                default:
                    System.out.println("Opcao invalida");
        }

        // Processa o pagamento usando a estratégia selecionada
        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentStrategy);
        paymentProcessor.executePayment(amount);
    }
}