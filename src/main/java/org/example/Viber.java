package org.example;

import java.util.ArrayList;

public class Viber implements Message{
    String nameUserViber = "DefaultNickName"; //Nickname пользователя
    String nameViber = "DefaultName"; //Имя пользователя
    String NumberViber = "000000"; //Номер пользователя
    ArrayList<String> idContact= new ArrayList<>(100000); //Id Контактов у пользователя
    ArrayList<String> ContactNumber = new ArrayList<>(100000);//Номера контактов у пользователя
    private ArrayList<String> nameContacts = new ArrayList<>(100000);//Имя контактов у пользователя
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
        String UserInfo = "Ваше NickName: "+ nameUserViber+"\n Ваше Имя: "+ nameViber +"\n Ваш номер: "+NumberViber;
        return UserInfo;
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
    public boolean equals(Object obj) {
    return true;}
    //Переопределение метода hashcode()
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
