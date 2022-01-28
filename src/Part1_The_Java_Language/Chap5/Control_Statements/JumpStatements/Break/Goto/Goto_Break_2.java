package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Break.Goto;
// Using break to exit from nested loop.
public class Goto_Break_2 {
    public static void main(String[] args) {
        outer: // label for goto statement
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass " +i+": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break outer;  // this is the goto statement
                }
                System.out.print(j+" ");
            }
            System.out.println("This will not print");
        } // goto statement breaks through
        System.out.println(); // except the first print every print will be on new line
        System.out.print("Loop Complete");
    }
}
