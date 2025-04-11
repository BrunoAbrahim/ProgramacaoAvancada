package com.unicesumar;

import com.unicesumar.config.Database;
import com.unicesumar.controller.ProductController;
import com.unicesumar.controller.UserController;
import com.unicesumar.repository.ProductRepository;
import com.unicesumar.repository.UserRepository;
import com.unicesumar.view.MainView;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = Database.getConnection();
            ProductRepository productRepo = new ProductRepository(conn);
            ProductController productController = new ProductController(productRepo);
            UserRepository userRepo = new UserRepository(conn);
            UserController userController = new UserController(userRepo);

            MainView view = new MainView(productController, userController);

            view.showMenu();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao iniciar o sistema: " + e.getMessage());
        }
    }
}
