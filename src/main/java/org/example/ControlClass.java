package org.example;

public class ControlClass {
    public String ChoiceMessge = "Viber";
    public void ControlMessage(){
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

    }
    public void ControlViber(){
        String ChoiceViber = "Выйти";
        switch (ChoiceViber)
        {
            case "Выйти":
            {
                System.out.println("Выходим из Viber");
                ChoiceMessge = " ";
                ControlMessage();
            }
        }
    }
    public void ControlTelegram(){
        String ChoiceTelegram = "Выйти";
        switch (ChoiceTelegram)
        {
            case "Выйти":
                {
                    System.out.println("Выходим из Telegram");
                    ControlMessage();
                }
        }
    }
}
