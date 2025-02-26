package org.example;

public class ContaCorrente extends ContaBancaria {
    private double ChequeEspecial;

    public ContaCorrente(int numeroConta, String titular, double saldo, double ChequeEspecial) {
        super(numeroConta, titular, saldo);
        this.ChequeEspecial = ChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo + ChequeEspecial) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente, mesmo considerando o cheque especial.");
            return false;
        }
    }
}
