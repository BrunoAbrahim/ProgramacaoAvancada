package org.example;

import java.util.Random;

class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOLETO-" + new Random().nextInt(100000);
        System.out.println("Pagamento de R$" + amount + " realizado via Boleto.");
        System.out.println("Código do Boleto: " + boletoCode);
    }
}
