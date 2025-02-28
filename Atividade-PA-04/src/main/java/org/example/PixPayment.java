package org.example;

import java.util.Random;

public class PixPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        // Gera um código aleatório para simular o código Pix
        String pixCode = "PIX-" + new Random().nextInt(1000000);
        System.out.println("Pagamento via Pix realizado! Código: " + pixCode);
        System.out.println("Valor pago: R$ " + amount);
    }
}
