package org.itstep;

import org.itstep.command.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Пишите ваш код здесь
        Scanner sc = new Scanner(System.in);
        String human;
        System.out.println("Существуют 4-ре комманды: help, echo + ваш текст, now и exit.");
        System.out.println("Введите комманду:");
        do {
            System.out.println(">>> ");
            human = sc.nextLine();
            if (commandHave(human)){
                commandMade(human);
            }
        }while(!human.equals("exit"));

    }

    public static void commandMade(String inform) {
        Command help = new HelpCommand();
        Command echo = new EchoCommand();
        Command now = new NowCommand();
        Command exit = new ExitCommand();
        while(true){
            if(inform.equals("help")){
                help.execute();
                break;
            }
            if(inform.startsWith("echo")){
                echo.execute();
                break;
            }
            if(inform.equals("now")){
                now.execute();
                break;
            }
            if(inform.equals("exit")){
                exit.execute();
                break;
            }
        }
    }

    public static boolean commandHave(String inform){
        if(inform.equals("help") || inform.equals("echo") || inform.equals("now") || inform.equals("exit")){
            return true;
        }else{
            System.out.println("Неверная комманда!!!");
            return false;
        }
    }
}

