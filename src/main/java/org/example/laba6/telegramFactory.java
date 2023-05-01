package org.example.laba6;

import org.example.Viber;

public class telegramFactory  extends Viber implements MessageFactory{
    @Override
    public void createInstance() {
        StaticMetod2and0.createInstance();
    }
}
