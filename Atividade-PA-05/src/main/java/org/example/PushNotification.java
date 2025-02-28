package org.example;

public class PushNotification implements Notification {
    //Envia a Notificação Push
    @Override
    public void send(String message){
        System.out.println("[Push Notification] Notificação enviada - " + message);
    }
}
