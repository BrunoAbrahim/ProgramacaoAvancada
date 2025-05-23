package com.unicesumar;

import com.unicesumar.entities.Product;
import com.unicesumar.entities.User;
import com.unicesumar.repository.ProductRepository;
import com.unicesumar.repository.UserRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ProductRepository listaDeProdutos = null;
        UserRepository listaDeUsuarios = null;
        Connection conn = null;


        String url = "jdbc:sqlite:database.sqlite";


        try {
            conn = DriverManager.getConnection(url);
            if (conn != null) {
                listaDeProdutos = new ProductRepository(conn);
                listaDeUsuarios = new UserRepository(conn);
            } else {
                System.out.println("Falha na conexão.");
                System.exit(1);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
            System.exit(1);
        }

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n---MENU---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listas Produtos");
            System.out.println("3 - Cadastrar Usuário");
            System.out.println("4 - Listar Usuários");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Cadastrar Produto");

                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    scanner.nextLine();

                    listaDeProdutos.save(new Product(nomeProduto, precoProduto));
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("Listar Produtos");
                    List<Product> products = listaDeProdutos.findAll();
                    products.forEach(System.out::println);
                    break;

                case 3:
                    System.out.println("Cadastrar Usuário");

                    System.out.print("Digite o nome do usuário: ");
                    String nomeUsuario = scanner.nextLine();

                    System.out.print("Digite o e-mail do usuário: ");
                    String emailUsuario = scanner.nextLine();

                    System.out.print("Digite a senha: ");
                    String senhaUsuario = scanner.nextLine();

                    User novoUsuario = new User(UUID.randomUUID(), nomeUsuario, emailUsuario, senhaUsuario);
                    listaDeUsuarios.save(novoUsuario);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("Listar Usuários");
                    List<User> users = listaDeUsuarios.findAll();
                    users.forEach(user -> {
                        System.out.println("Nome: " + user.getName());
                        System.out.println("Email: " + user.getEmail());
                        System.out.println("UUID: " + user.getUuid());
                    });
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (option != 5);

        scanner.close();
        try {
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
