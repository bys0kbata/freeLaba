package org.example;

import org.example.Laba5.ReaderRunnable;
import org.example.Laba5.ReaderThread;
import org.example.Laba5.WriterRunnable;
import org.example.Laba5.WriterThread;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
       /* ControlClass Control = new ControlClass();
        Control.ControlMessage();*/
        Viber viberMessage = new Viber();
        WriterThread writerViber = new WriterThread(viberMessage);
        ReaderThread readerViber = new ReaderThread(viberMessage);
        WriterRunnable wrunnableViber;
        ReaderRunnable rrunnableViber;
        writerViber.run();
        readerViber.run();
        for (int i = 0; i < viberMessage.getIDName().size(); i++) {
            wrunnableViber = new WriterRunnable(viberMessage, i );
            wrunnableViber.run();
            rrunnableViber = new ReaderRunnable(viberMessage,i);
            rrunnableViber.run();
        }
        System.out.println("Cтоп");
    }
}