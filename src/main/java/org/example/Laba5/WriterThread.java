package org.example.Laba5;

import org.example.Main;
import org.example.Message;
import org.example.Viber;

public class WriterThread extends Thread{
    Message obj;
    public WriterThread(Message obj){
        this.obj = obj;
    }
    @Override
    public void run() {
        try {
            String mem = "abcdefghijklm";
            String mem2 = "opqrstuvwxyz";
            int num = 1;
            for (int i = 0; i < obj.getSizeContacts(); i++) {
                System.out.println("Write: "+obj.getIDName().get(i)+" to position"+ i);
                if(i%2==0) {
                    obj.editContacts(i,mem);
                }
                else{
                    obj.editContacts(i,mem2);
                }

        }
        }catch (Exception e) {
            System.out.println("Не получилось");
        }
    }
}
