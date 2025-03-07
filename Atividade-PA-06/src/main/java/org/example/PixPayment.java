package org.example;

import java.util.Random;

class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + new Random().nextInt(100000);
        System.out.println("Pagamento de R$" + amount + " realizado via Pix.");
        System.out.println("Código Pix: " + pixCode);
    }
}
