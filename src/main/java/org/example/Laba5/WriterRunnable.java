package org.example.Laba5;

import org.example.Message;

public class WriterRunnable implements Runnable{
    Message obj;
    int num;
    public WriterRunnable(Message obj, int num){
        this.obj = obj;
        this.num = num;
    }
    @Override
    public void run() {
        String mem = "abcdefg";
        String mem2 = "opqrstu";
        System.out.println("Write: "+obj.getIDName().get(num)+" to position"+ num);
        obj.editContacts(num,"1100");
    }
}
