package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Continue;
// Demonstrate continue jump statement
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // the compiler first jump to increment then to conditional expression.
            System.out.print(i+" ");
            if (i % 2  == 0) {
                continue; // when executed, the statement after this will be ignored and the compiler jump to the loop.
            }
            System.out.println(" ");
        }
    }
}
