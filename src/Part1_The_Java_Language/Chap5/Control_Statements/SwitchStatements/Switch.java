package Part1_The_Java_Language.Chap5.Control_Statements.SwitchStatements;

import java.util.Scanner;

// An improved version of the season program.
public class Switch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
         //This is the default version of switch
//        String season;
//        switch (month){
//            case 12: case 1: case 2:
//                season = "Winter";
//                break;
//            case 3: case 4: case 5:
//                season = "Spring";
//                break;
//            case 6: case 7: case 8:
//                season = "Summer";
//                break;
//            case 9: case 10: case 11:
//                season = "Autumn";
//                break;
//            default: season = "Bogus";
//        }
        // This is the new level of enhanced switch
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Bogus";
        };
        System.out.println("The season is "+ season +".");
    }
}
