package Part1_The_Java_Language.Chap5.Control_Statements.SwitchStatements;

import java.util.Scanner;

//Use a String to control a switch statement.
public class StringSwitch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        switch (str) {
            case "one" -> System.out.println("one");
            case "two" -> System.out.println("two");
            case "three" -> System.out.println("three");
            default -> System.out.println("NoMatch");
        }
//        switch (str){
//            case "one":
//                System.out.println("one");
//                break;
//            case "two":
//                System.out.println("two");
//                break;
//            case "three":
//                System.out.println("three");
//                break;
//            default:
//                System.out.println("NoMatch");
//        }
    }
}
