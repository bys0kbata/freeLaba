package org.example.laba6;

import org.example.Message;

import java.util.Iterator;

public class MessageInterator<String> implements Iterable{
    private Message message;
    public MessageInterator(Message message){
        this.message = message;
    }
    @Override
    public Iterator iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;
            @Override
            public boolean hasNext() {
                return currentIndex < message.getSizeContacts();
            }

            @Override
            public String next() {
                if (hasNext()) return (String) message.getIDName().get(currentIndex++);
                else throw new UnsupportedOperationException("Что-то пошло не так...");
            }
        };

    }
}
