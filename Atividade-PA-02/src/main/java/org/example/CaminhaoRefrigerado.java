package org.example;

public class CaminhaoRefrigerado extends Caminhao{
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca,String modelo, int ano, int capacidadePassageiros, String combustivel,int capacidadeCarga, int temperaturaMinima) {
        super(marca,modelo,ano,capacidadePassageiros,combustivel, capacidadeCarga);
        this.temperaturaMinima = temperaturaMinima;
    }
    @Override
    public double calcularAutonomia(){
        double autonomiaBase = super.calcularAutonomia();
        return autonomiaBase * 0.9;
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Temperatura Minima: "+temperaturaMinima + " ºC");
    }
}
