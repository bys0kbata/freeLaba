package org.example;

import java.io.*;

import static java.io.DataInputStream.readUTF;

public class StaticMetod {
    //запись в и чтение из байтового потока
    public static void outputMessge(Message o, OutputStream out) throws IOException {
        DataOutputStream outputStream = new DataOutputStream(out);
        outputStream.writeUTF(o.getUserInfo());
        outputStream.write(o.getSizeContacts());
        outputStream.flush();
    }
    public static void inputMessge(InputStream in)
    {
       DataInputStream inputStream = new DataInputStream(in);
       try
       {
            String nickname = inputStream.readUTF();
       }catch (Exception e)
       {
           System.out.println("Не вышло");
       }

    }
    //запись в и чтение из символьного потока
    public static void writeMessage (Message o, Writer out)
    {

    }

    public static void readMessage(Reader in) {

    }
    //Вывод и ввод сериализованных обьектов
    public static void serializeMessage (Message o, OutputStream out)
    {

    }
    public static void deserializeMessage(InputStream in)
    {

    }
}
