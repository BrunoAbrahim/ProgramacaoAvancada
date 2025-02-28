package org.example;

public class SMSNotification implements Notification {
    //Envia a Notificação por SMS
    @Override
    public void send(String message){
        System.out.println("[SMS] Notificação enviada - " + message);
    }
}
