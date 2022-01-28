package Part1_The_Java_Language.Chap5.Control_Statements.JumpStatements.Break.Goto;
// This program contains an error.
public class Goto_Break_3_Err {
    public static void main(String[] args) {
        one:
        for (int i = 0; i < 3; i++) {
            System.out.println("Pass "+i+": ");
        }
        for (int j = 0; j < 100; j++) {
            if (j == 10) {
                break ;//one       // this break will not work since it is not inside the labeled loop
            }
            System.out.println(j+" ");
        }
    }
}
