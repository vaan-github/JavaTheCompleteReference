package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Continue;
// Using continue with a label
public class Continue_Label {
    public static void main(String[] args) {
        System.out.println();
        outer:
        for (int i = 0; i < 10; i++) {   // Table no.
            for (int j = 0; j < 10; j++) {  // Times its multiplied.
                if (j>i){   // loop until the j is greater than i
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i*j));  // table no. * times
            }
        }
        System.out.println();
    }
}
