package org.example;

public class Telegram implements Message {
    String nameUser = "DefaultNime";
    int sizeContacts = 0;


    public void addContacts(int idCont) {

    }

    @Override
    public void addContacts(int idCont, String nameContact) {

    }

    @Override
    public int getSizeContacts() {
        return 0;
    }



    @Override
    public String getNameUser() {
        return null;
    }
}
