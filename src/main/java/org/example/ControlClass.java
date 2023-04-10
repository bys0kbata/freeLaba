package org.example;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class ControlClass {
    public String ChoiceMessge = "Viber";
    public String byteFile = "byteMessage.byte";
    public String textFile = "textMessag.txt";
    public String serializableFile = "serializableMessag.bin";
    Scanner in = new Scanner(System.in);
    public Viber viberMessage = new Viber();
    public void ControlMessage(){
        try {
            System.out.println("Выберите Мессенджер (Viber/Telegram):");
            ChoiceMessge = in.next();
            switch (ChoiceMessge) {
                case "Viber": {
                    System.out.println("Вы выбрали Viber!");
                    ControlViber();
                    break;
                }
                case "Telegram": {
                    System.out.println("Вы выбрали Telegram!");
                    ControlTelegram();
                    break;
                }
                case " ": {
                    System.out.println("Перезапустите Control!");
                }
            }
        }catch (RuntimeException r)
        {
            System.out.println("Попробуй еще раз");
            ControlMessage();
        }

    } //Контроль вызова Мессенджера
    public void ControlViber(){
       int ChoiceViber;
       try {
           System.out.println("Выберите номер действие: \n 1) Добавить контакт; \n 2) Вывод всех контактов;  \n 3) Отправить сообщение контакта; \n 4) Изменить контакт; \n 5) Количество всего контактов; \n 6) Получение историй контактов; \n 7) Удаление контактов; \n 8) Полная информация о себе; \n 9) Выйти;");
           ChoiceViber = in.nextInt();
           switch (ChoiceViber) {
               case 1://Добавление контакта
               {
                   System.out.println("Введите ID контакта:");
                   String nickNameViber = in.next();
                   System.out.println("Введите номер контакта:");
                   String numberViber = in.next();
                   System.out.println("Введите имя контакта:");
                   String nameViber = in.next();
                   viberMessage.addContacts(nickNameViber, numberViber, nameViber);
                   System.out.println("Контакт " + nickNameViber + " добавлен");
                   ControlViber();
                   break;
               }
               case 2: //Вывод всех контактов
               {
                   System.out.println("Список ваших контактов:");
                   System.out.println(viberMessage.toString());
                   ControlViber();
                   break;
               }
               case 3://Отправить сообщение контакта
               {
                   System.out.println("Введите id контакта,которому хотите отправить сообщение:");
                   String messengeViberID = in.next();
                   System.out.println("Введите само сообщение:");
                   String messengeViber = in.next();
                   viberMessage.sendMessage(messengeViberID, messengeViber);
                   ControlViber();
                   break;
               }
               case 4://Изменить контакт
               {
                   System.out.println("Введите ID контакта, у которого хотите что-то изменить");
                   String editViber = in.next();
                   System.out.println("Введите Имя контакта или новое имя контакта:");
                   String editNameViber = in.next();
                   System.out.println("Введите новый номер контакта");
                   String editNumberViber = in.next();
                   viberMessage.editContacts(editViber, editNameViber, editNumberViber);
                   System.out.println("Контакт был изменен");
                   ControlViber();
                   break;
               }
               case 5://Количество всего контактов
               {
                   System.out.println("Количество ваших контактов: " + viberMessage.getSizeContacts());
                   ControlViber();
                   break;
               }
               case 6://Получение историй контактов
               {
                   System.out.println("Ваше история сообщений:");
                   viberMessage.equals();
                   for (int i = 0; i < viberMessage.gethistoryLastMessage().size(); i++) {
                       System.out.println("Получатель: " + viberMessage.gethistoryLastUserMessage().get(i));
                       System.out.println("Cообщение: " + viberMessage.gethistoryLastMessage().get(i));
                   }
                   break;

               }
               case 7://Удаление контактов
               {
                   FileWriter fileOutputStream = new FileWriter(textFile);
                   viberMessage.write(fileOutputStream);
                   OutputStream file = new FileOutputStream(byteFile);
                   viberMessage.output(file);
               }
               case 8://Полная информация о себе
               {
                   System.out.println("Ваш профиль: \n" + viberMessage.getUserInfo());
                   ControlViber();
                   break;
               }
               case 9://Выход из Мессенджера
               {
                   System.out.println("Выходим из Viber");
                   ChoiceMessge = " ";
                   ControlMessage();
                   break;
               }

           }
       }catch (Exception e) {
           System.out.println("Идешь в менюшку.");
           ControlMessage();
       }
    }
    public void ControlTelegram(){
        int ChoiceTelegram;
        Telegram telegramMessage = new Telegram();
        try {
            System.out.println("Выберите номер действие: \n 1) Добавить контакт; \n 2) Вывод всех контактов;  \n 3) Отправить сообщение контакта; \n 4) Изменить контакт; \n 5) Количество всего контактов; \n 6) Получение историй контактов; \n 7) Удаление контактов; \n 8) Полная информация о себе; \n 9) Выйти;");
            ChoiceTelegram = in.nextInt();
            switch (ChoiceTelegram) {
                case 1://Добавление контакта
                {
                    System.out.println("Введите ID контакта:");
                    String nickNameTelegram = in.next();
                    System.out.println("Введите номер контакта:");
                    String numberTelegram = in.next();
                    System.out.println("Введите имя контакта:");
                    String nameTelegram = in.next();
                    telegramMessage.addContacts(nickNameTelegram, numberTelegram, nameTelegram);
                    System.out.println("Контакт " + nickNameTelegram + " добавлен");
                    ControlTelegram();
                    break;
                }
                case 2: //Вывод всех контактов
                {
                    System.out.println("Список ваших контактов:");
                    System.out.println(telegramMessage.toString());
                    ControlTelegram();
                    break;
                }
                case 3://Отправить сообщение контакта
                {
                    System.out.println("Введите id контакта,которому хотите отправить сообщение:");
                    String messengeTelegramID = in.next();
                    System.out.println("Введите само сообщение:");
                    String messengeTelegram = in.next();
                    viberMessage.sendMessage(messengeTelegramID, messengeTelegram);
                    ControlTelegram();
                    break;
                }
                case 4://Изменить контакт
                {
                    System.out.println("Введите ID контакта, у которого хотите что-то изменить");
                    String editTelegram = in.next();
                    System.out.println("Введите Имя контакта или новое имя контакта:");
                    String editNameTelegram = in.next();
                    System.out.println("Введите новый номер контакта");
                    String editNumberTelegram = in.next();
                    viberMessage.editContacts(editTelegram, editNameTelegram, editNumberTelegram);
                    System.out.println("Контакт был изменен");
                    ControlTelegram();
                    break;
                }
                case 5://Количество всего контактов
                {
                    System.out.println("Количество ваших контактов: " + telegramMessage.getSizeContacts());
                    ControlTelegram();
                    break;
                }
                case 6://Получение историй контактов
                {
                    System.out.println("Ваше история сообщений:");
                    viberMessage.equals();
                    for (int i = 0; i < telegramMessage.gethistoryLastMessage().size(); i++) {
                        System.out.println("Получатель: " + telegramMessage.gethistoryLastUserMessage().get(i));
                        System.out.println("Cообщение: " + telegramMessage.gethistoryLastMessage().get(i));
                    }
                    ControlTelegram();
                    break;

                }
                case 7://Удаление контактов
                {

                }
                case 8://Полная информация о себе
                {
                    System.out.println("Ваш профиль: \n" + telegramMessage.getUserInfo());
                    ControlTelegram();
                    break;
                }
                case 9://Выход из Мессенджера
                {
                    System.out.println("Выходим из Viber");
                    ChoiceMessge = " ";
                    ControlMessage();
                    break;
                }

            }
        }catch (Exception e) {
            System.out.println("Идешь в менюшку.");
            ControlMessage();
        }
    }
}
