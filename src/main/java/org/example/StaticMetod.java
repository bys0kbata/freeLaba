package org.example;

import java.io.*;

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
        o.write(out);
    }

    public static void readMessage(BufferedReader in) {
        Message o = null;
            try {
                while(in.ready())
                {
                    String nickName = in.readLine();
                }
            }catch (IOException e ){
                throw new RuntimeException(e);
            }
    }
    //Вывод и ввод сериализованных обьектов
    public static void serializeMessage (Message o, OutputStream out)
    {
        ObjectOutputStream serializer;
        try {
            serializer = new ObjectOutputStream(out);
            serializer.writeObject(o);
            serializer.flush();

        }catch (Exception e)
        {
            System.out.println("Бывате(");
        }
    }
    public static Message deserializeMessage(InputStream in)
    {
        Message o;
        ObjectInputStream deserializer;
        try {
            deserializer = new ObjectInputStream(in);
            o = (Message) deserializer.readObject();
        } catch (IOException | ClassNotFoundException exc) {
            System.out.println(exc.getMessage());
            o = null;
        }
        return o;
    }

}
