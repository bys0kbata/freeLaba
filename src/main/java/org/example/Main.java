package org.example;


import org.example.laba6.MessageDecorator;
import org.example.laba6.MessageFactory;
import org.example.laba6.MessageInterator;
import org.example.laba6.viberFactory;

import java.io.IOException;

import static org.example.laba6.StaticMetod2and0.setMessageFactory;

public class Main {
    public static void main(String[] args) throws IOException {
       /* ControlClass Control = new ControlClass();
        Control.ControlMessage();*/
        System.out.println("Работа интератора туть: \n");
       Message viberMessage = new Viber();
       viberMessage.setIdContact(4);
       MessageInterator<String> viberInterator = new MessageInterator<String>(viberMessage);
        for (Object item : viberInterator) {
            System.out.println(item);
        }

        System.out.println("\n Работа декоратора воть тут:");
        MessageDecorator messageDecoratorD = new MessageDecorator(viberMessage);
        System.out.println(messageDecoratorD.getNameUser());

        MessageFactory viberFactory = new viberFactory();
        setMessageFactory(viberFactory);
        viberFactory.createInstance();
        System.out.println("\n Информация воть туть: \n"+viberFactory.toString());
    }
}


       /*
        WriterThread writerViber = new WriterThread(viberMessage);
        ReaderThread readerViber = new ReaderThread(viberMessage);
        WriterRunnable wrunnableViber;
        ReaderRunnable rrunnableViber;
        writerViber.run();
        readerViber.run();
        for (int i = 0; i < viberMessage.getIDName(currentIndex++).size(); i++) {
            wrunnableViber = new WriterRunnable(viberMessage, i );
            wrunnableViber.run();
            rrunnableViber = new ReaderRunnable(viberMessage,i);
            rrunnableViber.run();
        }
        System.out.println("Cтоп");
    }*/