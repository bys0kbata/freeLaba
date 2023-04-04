package org.example;

import java.util.Objects;


public interface Message {
    default int HashCode(Object O) {
        return Objects.hash(O);
    }
    default String tostring(Object O) {
        return Objects.toString(O);
    }
    default boolean equal(Object O, Object a) {
        return Objects.equals(O,a);
    }

    void addContacts(String idCont, String nameContact,String NumberCon);

    int getSizeContacts();
    default void sendMessageUser(int idCont, String message)
    {        System.out.println("Пользователю " + idCont+ " отправилось сообщение.");}
    String getUserInfo();
}
