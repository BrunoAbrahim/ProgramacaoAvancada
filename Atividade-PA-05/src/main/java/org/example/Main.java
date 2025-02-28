package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibe o menu de opções
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");

        // Obtém a escolha do usuário
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Solicita a mensagem
        System.out.print("Digite a mensagem a ser enviada: ");
        String message = scanner.nextLine();

        // Define o tipo de notificação baseado na escolha
        String notificationType;
        switch (choice) {
            case 1 -> notificationType = "email";
            case 2 -> notificationType = "sms";
            case 3 -> notificationType = "push";
            default -> {
                System.out.println("Opção inválida.");
                return;
            }
        }


        // Cria a instância de notificação e envia a mensagem
        Notification notification = NotificationFactory.createNotification(notificationType);
        notification.send(message);
    }
}