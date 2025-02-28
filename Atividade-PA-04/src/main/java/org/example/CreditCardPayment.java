package org.example;

import java.util.Scanner;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        // Simula o número de cartão
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do cartão");
        String cardNumber = scanner.nextLine();

        System.out.println("Pagamento via cartao de credito realizado");
        System.out.println("numero do cartao: " + cardNumber);
        System.out.println("valor pago: " + amount);
    }
}
