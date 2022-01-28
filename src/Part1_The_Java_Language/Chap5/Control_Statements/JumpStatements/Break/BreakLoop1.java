package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Break;
// Using break to exit loop
public class BreakLoop1 {
    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            if (i == 10) {
                break;   // the loop terminates
            }
            System.out.println("i: "+ i);
        }
        System.out.println("Loop complete");
    }
}
