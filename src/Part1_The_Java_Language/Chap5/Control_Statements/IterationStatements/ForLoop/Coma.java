package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop;
// Using comma to add more than one parameter in the for loop.
public class Coma {
    public static void main(String[] args) {  // write main and hit TAB for auto-complete
        int a, b;
        for(a=1, b=4; a<b; a++, b--){
            System.out.println("a="+ a );   // write sout and hit TAB for auto-complete
            System.out.println("b="+ b );
        }
    }
}
