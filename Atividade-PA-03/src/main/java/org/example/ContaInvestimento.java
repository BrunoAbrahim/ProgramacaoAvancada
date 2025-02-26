package org.example;

public class ContaInvestimento extends ContaBancaria{

    public ContaInvestimento(int numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor) {
        if (valor<=saldo){
            saldo -= valor;
            double taxaRetirada = valor * 0.2;
            System.out.println("Saque de R$" + valor + " realizado. Taxa Retirada R$" + taxaRetirada + "Novo saldo: R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }
}
