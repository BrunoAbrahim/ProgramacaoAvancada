package org.example;

public class ContaInvestimentoAltoRisco extends ContaInvestimento{
    private static final double TAXA_ALTO_RISCO = 0.05;
    private static final double SALDO_MINIMO_SAQUE = 10000.00;

    public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor * (1 + TAXA_ALTO_RISCO);
        if (saldo >= SALDO_MINIMO_SAQUE && valorComTaxa <= saldo) {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com taxa de 5%. Novo saldo: R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente ou mínimo de R$10.000,00 não atingido para saque.");
            return false;
        }
    }
}
