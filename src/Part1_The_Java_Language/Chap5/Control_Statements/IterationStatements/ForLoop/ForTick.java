package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop;
// Demonstrate the for loop.
public class ForTick {
    public static void main(String[] args) {
        System.out.println("Case 1");
        int n;
        for(n=10;n>0;n--) System.out.println("tick" +n);

        System.out.println();
        System.out.println("Case 2");
        // The initialization is inside the for-loop.
        // The scope of i is inside the loop only
        for (int i=10; i>0; i--) System.out.println("tick" +i);
    }
}


