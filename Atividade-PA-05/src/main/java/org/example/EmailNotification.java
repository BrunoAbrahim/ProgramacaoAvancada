package org.example;

public class EmailNotification implements Notification {
    //Envia a Notificação por e-mail
    @Override
    public void send(String message){
        System.out.println("[e-mail] Notificação enviada - " + message);
    }
}
