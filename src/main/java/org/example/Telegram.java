package org.example;

public class Telegram implements Message {
    //Имя пользователя
    String nameUser;
    //id Контактов
    int[] idContacts;
    //Имя контактов
    String[] nameContacts;
    //конструктор по умолчанию
    public Telegram()
    {
        this.nameUser =  "DefaultName";
        this.idContacts = new int[1];
        this.idContacts[0] = 911;
        this.nameContacts =new String[1];
        this.nameContacts[0] = "Cлужба помощи.";
    }
    //конструктор с параметрами
    public Telegram(String nameUser,int sizeContact)
    {
        this.nameUser = nameUser;
        this.idContacts = new int[sizeContact];
    }
    //Добавление контакта.
    @Override
    public void addContacts(int idCont, String nameContact)
    {
        idContacts[1] = idCont;
        nameContacts[1] = nameContact;
    }
    //Получение количество контактов

    public int getSizeContacts()
    {
        return idContacts.length;
    }
    //Переопределение метода toString()
    public void tostring() {
        for (int i = 0; i < idContacts.length; i++) {
            System.out.println(i+1 + ". id number = "+ idContacts[i]+" Имя контакта: " + nameContacts[i]+"\n");
        }
    }
    //Переопределение метода equals()
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Viber other = (Viber) obj;
        if (idContacts != other.idContacts)
            return false;
        if (nameUser == null) {
            if (other.nameUser != null)
                return false;
        } else if (!nameUser.equals(other.nameUser))
            return false;
        return true;
    }
    //Переопределение метода hashcode()
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idContacts[1];
        result = prime * result + ((nameUser == null) ? 0 : nameUser.hashCode());
        return result;
    }
    //Получение имени пользователя.
    @Override
    public String getNameUser() {
        return nameUser;
    }
}
