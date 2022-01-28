package Part1_The_Java_Language.Chap5.Control_Statements.SwitchStatements;

import java.util.Scanner;
// This is my own created example
public class SwitchNested {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String month = sc.next();
        int message = sc.nextInt();
        boolean messageChecker = true; // this is used to make our program work on case jan or feb and no. greater than 5
        switch (month){
            case "jan" -> {
                System.out.println("This is January");
                switch (message){
                    case 1 -> System.out.println("There is one message");
                    case 2 -> System.out.println("There is two message");
                    case 3 -> System.out.println("There is three message");
                    case 4 -> System.out.println("There is four message");
                    case 5 -> System.out.println("There is five message");
                    default -> {
                        System.out.println("Invalid Input Message");
                        messageChecker = false;
                    }
                }
            }
            case "feb"-> {
                System.out.println("This is Feb");
                switch (message){
                    case 1 -> System.out.println("There is one message");
                    case 2 -> System.out.println("There is two message");
                    case 3 -> System.out.println("There is three message");
                    case 4 -> System.out.println("There is four message");
                    case 5 -> System.out.println("There is five message");
                    default -> {
                        System.out.println("Invalid Input Message");
                        messageChecker = false;
                    }
                }
            }
            default -> System.out.println("Invalid Input Month");
        }
         if (message >6) {
             if (messageChecker) {
             System.out.println("Invalid Input Message");
             }
         }
    }
}
