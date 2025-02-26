package org.example;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int numeroConta, String titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    @Override
    public boolean sacar(double valor){
        if (valor<=saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
            return true;
        } else {
            System.out.println("Saldo insuficiente para o saque.");
            return false;
        }
    }
}
