package org.example;

public class Caminhao extends Veiculo {
    protected double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano,capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
    public double calcularAutonomia(){
        int capacidadeTanque = 300;
        double consumoBase = 6.0;
        double reducaoMax = 0.25;
        double reducaoPorTonelada = 0.01;
        double reducaoTotal= Math.min(capacidadeCarga*reducaoPorTonelada, reducaoMax);
        double consumoFinal = consumoBase *(1- reducaoTotal);
        return capacidadeTanque * consumoFinal;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}
