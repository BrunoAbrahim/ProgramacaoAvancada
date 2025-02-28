package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        // Gera um código de boleto fictício
        String boletoCode = "Boleto - " + new Random().nextInt(100000);
        System.out.println("Pagamento via Boleto realizado! Código do boleto: " + boletoCode);
        System.out.println("Valor pago: R$ " + amount);

    }
}
