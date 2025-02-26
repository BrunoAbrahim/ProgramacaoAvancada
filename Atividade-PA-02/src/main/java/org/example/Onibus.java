package org.example;

public class Onibus extends Veiculo {
    int quantidadeEixos;

    public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel,int quantidadeEixos) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (quantidadeEixos < 6 || quantidadeEixos > 8) {
            throw new IllegalArgumentException("O ônibus deve ter entre 6 e 8 eixos.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    @Override
    public double calcularAutonomia(){
        int capacidadeTanque = 200;
        double consumo = 5.0;
        return capacidadeTanque * consumo;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
    }
}
