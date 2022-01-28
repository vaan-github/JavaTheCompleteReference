package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Return;
import java.util.Scanner;

// Demonstrate return.
public class Return {
    public static void main(String[] args) {
        System.out.println("Enter true/false ");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();

        boolean t = Boolean.parseBoolean(a);
        System.out.println("Before the return");
        if (t) {
            return;  // compiler jumps to the main(); called by Java runtime system
        }
        System.out.println("This execute only when condition is false");
    }
}
