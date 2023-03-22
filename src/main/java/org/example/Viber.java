package org.example;

public class Viber implements Message{
    String nameUser;
    int[] idContacts;
    String[] nameContacts;
    public Viber()
    {
        this.nameUser =  "DefaultName";
        this.idContacts = new int[1];
        this.idContacts[0] = 911;
        this.nameContacts =new String[1];
        this.nameContacts[0] = "Cлужба помощи.";
    }

    public Viber(String nameUser,int sizeContact)
    {
        this.nameUser = nameUser;
        this.idContacts = new int[sizeContact];
    }
    @Override
    public void addContacts(int idCont, String nameContact)
    {
            idContacts[1] = idCont;
            nameContacts[1] = nameContact;
    }

    public int getSizeContacts()
    {
        return idContacts.length;
    }

    public void tostring() {
        for (int i = 0; i < idContacts.length; i++) {
            System.out.println(i+1 + ". id number = "+ idContacts[i]+" Имя контакта: " + nameContacts[i]+"\n");
        }
    }
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
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + idContacts[1];
        result = prime * result + ((nameUser == null) ? 0 : nameUser.hashCode());
        return result;
    }
    @Override
    public String getNameUser() {
        return nameUser;
    }
}
