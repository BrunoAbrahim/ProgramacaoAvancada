package com.unicesumar.view;

import com.unicesumar.controller.ProductController;
import com.unicesumar.controller.UserController;
import com.unicesumar.entities.Product;
import com.unicesumar.entities.User;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MainView {
    private final Scanner scanner = new Scanner(System.in);
    private final ProductController productController;
    private final UserController userController;

    public MainView(ProductController productController, UserController userController) {
        this.productController = productController;
        this.userController = userController;
    }

    public void showMenu() {
        int opcao;
        do {
            System.out.println("\n=== E-Commerce CLI ===");
            System.out.println("1. Listar Produtos");
            System.out.println("2. Cadastrar Produto");
            System.out.println("3. Listar Usuários");
            System.out.println("4. Cadastrar Usuário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1: listarProdutos();
                break;
                case 2 : cadastrarProduto();
                break;
                case 3 : listarUsuarios();
                break;
                case 4 : cadastrarUsuario();
                break;
                case 0 : System.out.println("Saindo...");
                break;
                default : System.out.println("Opção inválida!");
                break;
            }
        } while (opcao != 0);
    }

    private void listarProdutos() {
        List<Product> produtos = productController.getAllProducts();
        produtos.forEach(p -> System.out.println(p.getUuid() + ": " + p.getName()));
    }

    private void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        UUID id = UUID.randomUUID(); // gera ID automaticamente
        productController.createProduct(id, nome, preco);

        System.out.println("Produto cadastrado!");
    }

    private void listarUsuarios() {
        List<User> usuarios = userController.getAllUsers();
        usuarios.forEach(u -> System.out.println(u.getUuid() + ": " + u.getName()));
    }

    private void cadastrarUsuario() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        userController.createUser(nome, email, senha);
        System.out.println("Usuário cadastrado!");
    }

}
