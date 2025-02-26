package org.example;

public class CarroEletrico extends Carro{
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros,String tipoCarro, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, "Eletrico", tipoCarro);
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia(){
        double consumoPorKWh = 5.0;
        return bateriaKWh * consumoPorKWh;
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Bateria KWh: " + bateriaKWh+ " KWh");
    }
}
