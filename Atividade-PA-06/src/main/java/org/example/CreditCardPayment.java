package org.example;

import java.util.Scanner;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.print("Digite o número do cartão (fictício): ");
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de R$" + amount + " realizado via Cartão de Crédito.");
        System.out.println("Cartão utilizado: " + cardNumber);
    }
}