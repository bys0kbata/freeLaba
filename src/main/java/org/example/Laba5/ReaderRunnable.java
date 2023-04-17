package org.example.Laba5;

import org.example.Message;

public class ReaderRunnable implements Runnable{

        Message obj;
        int num;
    public ReaderRunnable(Message obj, int num) {
            this.obj = obj;
            this.num = num;
        }

    @Override
    public void run() {
        System.out.println("Read: "+obj.getIDName().get(num)+" to position"+ num);
    }
}
