package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(12345, "João", 500, 200);
        ContaPoupanca cp = new ContaPoupanca(67890, "Maria", 1000);
        ContaInvestimento ci = new ContaInvestimento(11223, "Carlos", 5000);
        ContaSalario cs = new ContaSalario(44556, "Ana", 2000, 500);
        ContaInvestimentoAltoRisco ciar = new ContaInvestimentoAltoRisco(77889, "Pedro", 12000);

        cc.exibirInformacoes();
        cc.sacar(600);

        cp.exibirInformacoes();
        cp.sacar(1100);

        ci.exibirInformacoes();
        ci.sacar(4900);

        cs.exibirInformacoes();
        cs.sacar(500);
        cs.sacar(500);

        ciar.exibirInformacoes();
        ciar.sacar(1000);

    }
}