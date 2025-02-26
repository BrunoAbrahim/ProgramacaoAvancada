package org.example;

public class ContaSalario extends ContaCorrente {
    private int saquesGratuitos;
    private static final double TAXA_EXTRA = 5.00;

    public ContaSalario(int numeroConta, String titular, double saldo, double ChequeEspecial) {
        super(numeroConta, titular, saldo, ChequeEspecial);
        this.saquesGratuitos = 1;
    }

    @Override
    public boolean sacar(double valor) {
        if(saquesGratuitos > 0){
            return super.sacar(valor);
        } else {
            return super.sacar(valor+TAXA_EXTRA);
        }
    }
}
