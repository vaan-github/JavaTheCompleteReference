package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.WhileLoop;

import java.util.Scanner;

// Demonstrate the while loop.
public class While {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            System.out.println("tick"+n);
            n--;
        }
    }
}
