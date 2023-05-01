package org.example;

import java.io.*;
import java.util.ArrayList;

public class Telegram implements Message{
    private String nameUserTelegram = "DefaultNickName"; //Nickname пользователя
    private String nameTelegram = "DefaultName"; //Имя пользователя
    private String NumberTelegram = "000000"; //Номер пользователя
    private ArrayList<String> idContact= new ArrayList<>(100000); //Id Контактов у пользователя
    private ArrayList<String> ContactNumber = new ArrayList<>(100000);//Номера контактов у пользователя
    private ArrayList<String> nameContacts = new ArrayList<>(100000);//Имя контактов у пользователя
    private ArrayList<String> historyMessage = new ArrayList<>(1000000);
    private ArrayList<String> historyLastUserMessage = new ArrayList<>(100000);
    private ArrayList<String> historyLastMessage = new ArrayList<>(100000);

    /*
    Конструкторы все
     */
    //конструктор по умолчанию
    public Telegram()
    {
        this.nameUserTelegram = "DefaultName";
        this.idContact.add(0, "DefaultConOne");
        this.ContactNumber.add(0, "911");
        this.nameContacts.add(0, "Cлужба помощи.");
        this.idContact.add(1, "DefaultConTwo");
        this.ContactNumber.add(1, "112");
        this.nameContacts.add(1, "Cлужба помощи.");
    }
    //конструктор с параметрами
    public Telegram(String nameUser)
    {
        this.nameUserTelegram = nameUser;
        this.idContact.add(0, "DefaultConOne");
        this.ContactNumber.add(0, "911");
        this.nameContacts.add(0, "Служба помощи.");
        this.idContact.add(1, "DefaultConTwo");
        this.ContactNumber.add(1, "112");
        this.nameContacts.add(1, "Cлужба помощи.");
    }

    @Override
    public String getNameUser() {
        return  nameUserTelegram;
    }

    /*
        Добавление контактов.
         */
    @Override
    public void addContacts(String idCont, String nameContact,String NumberCon)
    {
        idContact.add(NumberCon);
        ContactNumber.add(idCont);
        nameContacts.add( nameContact);
    }

    @Override
    public void editIdContacts(int idCont, String nameContact) {
        idContact.set(idCont,nameContact);
    }

    /*
    Изменение данных контакта
    */
    @Override
    public void editContacts(String idCont, String nameContact, String NumberCon)
    {
        for (int i = 0; i < idContact.size(); i++) {

            if (idContact.get(i) == NumberCon) {
                ContactNumber.set(i,idCont);
                nameContacts.set(i,nameContact);
            }
        }
    }
    /*
    Получение количество записанных контактов у пользователя
     */
    public int getSizeContacts()
    {
        return ContactNumber.size();
    }
    /*
    Получение полной информаций о пользователе.
     */
    @Override
    public String getUserInfo() {
        String UserInfo = "Ваше NickName: "+ nameUserTelegram +"\n Ваше Имя: "+ nameTelegram +"\n Ваш номер: "+ NumberTelegram;
        return UserInfo;
    }

    @Override
    public void equals() {
        for (int i = 0; i < historyMessage.size(); i++) {
            if (i % 2 == 0) {
                historyLastUserMessage.add(historyMessage.get(i));
            }
            else
            {
                historyLastMessage.add(historyMessage.get(i));
            }

        }
    }

    @Override
    public void sendMessage(String idContact, String Message) {
        for (int i = 0; i < this.idContact.size(); i++) {
            if (idContact == this.idContact.get(i)) {
                historyMessage.add(idContact);
                historyMessage.add(Message);
            }
        }
    }
    @Override
    public ArrayList<String> getHistoryMessage()
    {
        return historyMessage;
    }
    //Переопределение метода toString()
    @Override
    public String toString() {
        String wordsAll = " ";
        for (int i = 0; i < getSizeContacts(); i++) {
            wordsAll= i+1 + ". Номер контакта: "+ ContactNumber.get(i) +"\n   Имя контакта: " + nameContacts.get(i) +"\n   Nickname: "+idContact.get(i)+"\n"+wordsAll;
        }
        return wordsAll;
    }
    //Переопределение метода equals()

    //Переопределение метода hashcode()
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public void output(OutputStream out) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(out);
        outputStream.writeUTF(getClass().getName());
        outputStream.write(nameTelegram.getBytes());
        outputStream.flush();
    }
    @Override
    public void write(Writer out) {
        PrintWriter printWriter = new PrintWriter(out);
        printWriter.println(getClass().getName());
        printWriter.println(nameTelegram);
        printWriter.println();
        printWriter.flush();
    }
    @Override
    public ArrayList<String> gethistoryLastUserMessage()
    {
        return historyLastUserMessage;
    }

    @Override
    public ArrayList<String> getIDName() {
        return idContact;
    }

    @Override
    public ArrayList<String> gethistoryLastMessage()
    {
        return historyLastMessage;
    }

    @Override
    public void editContacts(int idCont, String nameContact) {

    }

    @Override
    public void setIdContact(int amountOfItems) {

    }
}
