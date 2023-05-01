package org.example.laba6;

import org.example.Message;
import org.example.Viber;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.util.ArrayList;

import static org.example.laba6.StaticMetod2and0.unmodifiableMessage;

public class MessageDecorator implements Message {
    private Message messageDecorator = new Viber();
    public MessageDecorator(Message decoratedMessage){
        this.messageDecorator = unmodifiableMessage(messageDecorator);
    }


    @Override
    public String getNameUser() {
        return messageDecorator.getNameUser();
    }

    @Override
    public void addContacts(String idCont, String nameContact, String NumberCon) {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public void editIdContacts(int idCont, String nameContact) {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public void editContacts(String idCont, String nameContact, String NumberCon) {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public int getSizeContacts() {
        return messageDecorator.getSizeContacts();
    }

    @Override
    public String getUserInfo() {
        return messageDecorator.getUserInfo();
    }

    @Override
    public void equals() {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public void sendMessage(String idContact, String Message) {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public ArrayList<String> getHistoryMessage() {
        return messageDecorator.getHistoryMessage();
    }

    @Override
    public void output(OutputStream out) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(out);
        outputStream.writeUTF(getClass().getName());
        outputStream.write(getUserInfo().getBytes());
        outputStream.flush();
    }

    @Override
    public void write(Writer out) {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public ArrayList<String> gethistoryLastUserMessage() {
        return messageDecorator.gethistoryLastUserMessage();
    }

    @Override
    public ArrayList<String> getIDName() {
        return messageDecorator.getIDName();
    }

    @Override
    public ArrayList<String> gethistoryLastMessage() {
        return messageDecorator.gethistoryLastMessage();
    }

    @Override
    public void editContacts(int idCont, String nameContact) {
        throw new UnsupportedOperationException("Power is in the truth");
    }

    @Override
    public void setIdContact(int amountOfItems) {
        throw new UnsupportedOperationException("Power is in the truth");
    }
}
