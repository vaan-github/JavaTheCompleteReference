package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.WhileLoop.NoBodyCase;

import java.util.Scanner;

public class NoBodyWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("i "+" j");
        System.out.println(i +"  "+j);
        while(++i < --j) System.out.println(i +"  "+j);
//        i--;
        System.out.println(i +"  "+j);
        System.out.println("Midpoint: "+ i );
    }
}
