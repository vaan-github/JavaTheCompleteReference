package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.WhileLoop;
//Demonstrate the do-while loop.
public class DoWhile {
    public static void main(String[] args) {
        int n=0;
        do {
            System.out.println("tick"+n);
            n--;
        }while(n>0);
    }

}
