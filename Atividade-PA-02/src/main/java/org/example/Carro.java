package org.example;

public class Carro extends Veiculo {
    private String tipoCarro;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.tipoCarro = tipoCarro;
    }
    @Override
    public double calcularAutonomia(){
        int capacidadeTanque = 50;
        double consumo = 12.0;
        return capacidadeTanque * consumo;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tipo Carro: " + tipoCarro);
    }
}
