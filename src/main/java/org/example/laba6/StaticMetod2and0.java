package org.example.laba6;

import org.example.Message;

public class StaticMetod2and0 {
    public static Message unmodifiableMessage(Message mes){
        return mes;
    }
    private static MessageFactory viFactory = new viberFactory();
    public static void setMessageFactory(MessageFactory factory) {
        StaticMetod2and0.viFactory = factory;
    }
    public static void createInstance(){
        if (viFactory instanceof viberFactory) {

            viFactory.sendMessage("911","Привет");
            viFactory.addContacts("tyt","Витя","8996757464654");
        } else if (viFactory instanceof telegramFactory) {

            viFactory.sendMessage("911","Привет");
            viFactory.addContacts("tyt","Витя","8996757464654");
        }
    }


}
