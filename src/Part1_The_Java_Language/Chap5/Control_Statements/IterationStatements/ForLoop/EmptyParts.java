package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop;
// Parts of the for loop can be empty.
public class EmptyParts {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i= 0; // it can be set any-where
        for (;!done;){
            System.out.println("i is"+ i);
            if (i==0) done = true;
            i++;  // iterate non-sequentially
        }
    }
}
