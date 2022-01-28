package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop.ForEach;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) throws InputMismatchException {
        String response = "yes";
        while (Objects.equals(response, "yes")){     // This object is used to return ture and false values
            int[] numb = {6, 8, 3, 7, 5, 6, 1, 4};
            System.out.println("Enter the value: ");
            boolean found = false; // Initializing
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            // Using for-each style for loop to search for a given number
            for (int x :
                    numb) {
                if (x == val) {
                    found = true;
                    break; // this is used so that the elements after the 5 will not get compared .Since there is no need for that
                }
            }
            if (found) System.out.println("Value founded");
            else System.out.println("No such value is there in an array");

            System.out.println("do yo want to continue(yes/no): "); //Ask user about the continuation
            Scanner pt = new Scanner(System.in);
            response = pt.nextLine();

        }
    }
}
