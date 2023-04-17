package org.example.Laba5;

import org.example.Message;

public class ReaderThread extends Thread {
    Message obj;
    public ReaderThread(Message obj){
        this.obj = obj;
    }
    public void run(){
        for (int i = 0; i < obj.getSizeContacts(); i++) {
            System.out.println("Read: "+obj.getIDName().get(i)+" to position"+ i);
        }
    }
}
