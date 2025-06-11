package org.example;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Sedan", 100);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes", "O500", 2019, 50, "Diesel", 6);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "P410", 2021, 2, "Diesel", 8, -18);

        Veiculo[] veiculos = {carro, carroEletrico, caminhao, onibus, caminhaoRefrigerado};

        for (Veiculo veiculo : veiculos) {
            veiculo.exibirDetalhes();
            System.out.println("Autonomia: " + veiculo.calcularAutonomia() + " km");
            System.out.println("---------------------------");
        }

    }
}