package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Break;
// Using break with nested loops.
public class BreakLoop2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Pass "+i+": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10) {
                    break; //compiler jumps to the outer loop i.
                    // conditional expression has the right to break the loop ; break is for special condition.
                }
                System.out.print(j + " ");
            }
            System.out.println(); //after break executed the compiler will be here
        }
    }
}
