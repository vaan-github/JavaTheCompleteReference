package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Break.Goto;
// Using a break as a civilized form of goto.
public class Goto_Break_1 {
    public static void main(String[] args) {
        boolean t = true;
        first: {  // label-name :{  . this is used to label the block ,for the goto statement or enhanced break.
            second: {
            third: {
                System.out.println("before the break");
                if (t) {
                    break second; // break label . this will break till the second loop.
                }
                System.out.println("This wont execute");
               }
            } // this is the closing statement of the second block
            System.out.println("This is after second block");
        }
    }
}
