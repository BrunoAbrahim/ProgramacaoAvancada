package org.example;

class PaymentFactory {
    public static PaymentStrategy createPaymentMethod(String type) {
        return switch (type) {
            case "1" -> new PixPayment();
            case "2" -> new CreditCardPayment();
            case "3" -> new BoletoPayment();
            default -> throw new IllegalArgumentException("Método de pagamento inválido");
        };
    }
}