package org.example;

public class Main {
    public static void main(String[] args)
    {
        Viber n = new Viber();
        n.addContacts("89963420562","Гоша","megasuperJava");
        System.out.println(n.getUserInfo());
        System.out.println(n.getSizeContacts());
        System.out.println(n.toString());
    }
}