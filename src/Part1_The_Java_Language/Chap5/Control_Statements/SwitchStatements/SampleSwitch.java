package Part1_The_Java_Language.Chap5.Control_Statements.SwitchStatements;
// A simple example of switch .
public class SampleSwitch {
    public static void main(String[] args){
        for(int i = 0; i<5; i++)
            // Default version of switch statement
//            switch(i){
//                case 0: System.out.println("i is zero.");
//                    break;
//                case 1: System.out.println("i is one.");
//                    break;
//                case 2: System.out.println("i is two.");
//                    break;
//                case 3: System.out.println("i is three.");
//                    break;
//                default: System.out.println("i is greater than three.");
//            }

            // Below code is the enhanced version of switch statement
            switch (i) {
                case 0 -> System.out.println("i is zero.");
                case 1 -> System.out.println("i is one.");
                case 2 -> System.out.println("i is two.");
                case 3 -> System.out.println("i is three.");
                default -> System.out.println("i is greater than three.");
            }
    }
}
