package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop;

import java.io.IOException;
import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) throws IOException {
        boolean isPrime;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream.
        int num = sc.nextInt();

        isPrime = num >= 2; // short version of the below code.
//         if (num<2) isPrime = false;
//        else isPrime = true;

        for (int i=2; i<=num/i;i++){     // here i<=num is not understood by me.
            if ((num%i)==0){
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
