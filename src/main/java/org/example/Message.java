package org.example;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;


public interface Message {
    String getNameUser();

    void addContacts(String idCont, String nameContact, String NumberCon);

    void editIdContacts(int idCont, String nameContact);

    void editContacts(String idCont, String nameContact, String NumberCon);
    int getSizeContacts();
    String getUserInfo();
    void equals();
    void sendMessage(String idContact, String Message);
    ArrayList<String> getHistoryMessage();
    void output(OutputStream out) throws IOException;
    void write(Writer out);
    ArrayList<String> gethistoryLastUserMessage();

    ArrayList<String> getIDName();

    ArrayList<String> gethistoryLastMessage();

    void editContacts(int idCont, String nameContact);

    void setIdContact(int amountOfItems);
}
