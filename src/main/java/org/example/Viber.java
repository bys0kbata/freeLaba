package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Viber implements Message{
    private String nameUserViber = "DefaultNickName"; //Nickname пользователя
    private String nameViber = "DefaultName"; //Имя пользователя
    private String NumberViber = "000000"; //Номер пользователя
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
    public Viber()
        {
            this.nameUserViber = "DefaultName";
            this.idContact.add(0, "DefaultConOne");
            this.ContactNumber.add(0, "911");
            this.nameContacts.add(0, "Cлужба помощи.");
            this.idContact.add(1, "DefaultConTwo");
            this.ContactNumber.add(1, "112");
            this.nameContacts.add(1, "Cлужба помощи.");

        }
        //конструктор с параметрами
    public Viber(String nameUser)
        {
            this.nameUserViber = nameUser;
            this.idContact.add(0, "DefaultConOne");
            this.ContactNumber.add(0, "911");
            this.nameContacts.add(0, "Служба помощи.");
            this.idContact.add(1, "DefaultConTwo");
            this.ContactNumber.add(1, "112");
            this.nameContacts.add(1, "Cлужба помощи.");

        }
        @Override
        public String getNameUser(){
        return nameUserViber;
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
    public void editIdContacts(int idCont, String nameContact)
    {
        idContact.set(idCont,nameContact);
    }
    /*
    Изменение данных контакта
    */
    @Override
    public void editContacts(String idCont, String nameContact,String NumberCon)
    {
        for (int i = 0; i < idContact.size(); i++) {

            if (idContact.get(i) == idCont) {
                ContactNumber.set(i,NumberCon);
                nameContacts.set(i,nameContact);
            }
        }
    }
    /*
    Получение количество записанных контактов у пользователя
     */
    @Override
    public int getSizeContacts()
    {
        return idContact.size();
    }
    /*
    Получение полной информаций о пользователе.
     */
    @Override
    public String getUserInfo() {
        String UserInfo = "Ваше NickName: "+ nameUserViber+"\n Ваше Имя: "+ nameViber +"\n Ваш номер: "+NumberViber;
        return UserInfo;
    }
    @Override
    public void sendMessage(String idContact, String Message) {
                historyMessage.add(idContact);
                historyMessage.add(Message);
                System.out.println("Cообщение отправилось");
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
    @Override
    public void equals() {
        for (int i = 0; i < historyMessage.size(); i++) {
            if( i%2 == 0 )
            {
                historyLastUserMessage.add(historyMessage.get(i));
            }
            else
            {
                historyLastMessage.add(historyMessage.get(i));
            }

        }
    }
    //Переопределение метода hashcode()
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public ArrayList<String> gethistoryLastUserMessage()
    {
        return historyLastUserMessage;
    }
    @Override
    public ArrayList<String> getIDName(){return idContact;}
    @Override
    public ArrayList<String> gethistoryLastMessage()
    {
        return historyLastMessage;
    }

    @Override
    public void editContacts(int idCont, String nameContact) {
        idContact.set(idCont,nameContact);
    }

    @Override
    public void output(OutputStream out) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(out);
        outputStream.writeUTF(getClass().getName());
        outputStream.write(nameViber.getBytes());
        outputStream.flush();
    }
    @Override
    public void write(Writer out) {
        PrintWriter printWriter = new PrintWriter(out);
        printWriter.println(getClass().getName());
        printWriter.println(nameViber);
        printWriter.println();
        printWriter.flush();
    }
    @Override
    public void setIdContact(int amountOfItems) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < amountOfItems; i++) {
            String cont = scan.nextLine();
            if (i < idContact.size()) {
                this.idContact.set(i, cont);
            }
            else {
                this.idContact.add(i,cont);
            }
        }
    }
}
