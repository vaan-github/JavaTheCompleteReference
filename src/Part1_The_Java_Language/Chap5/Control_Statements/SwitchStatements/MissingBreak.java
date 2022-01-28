package Part1_The_Java_Language.Chap5.Control_Statements.SwitchStatements;
// In a switch, break statement are optional.
public class MissingBreak {
    public static void main (String[] args){
        for (int i = 0; i<12; i++)
            // Default versions of switch missing breaks
//            switch (i){
//                case 0:
//                case 1:
//                case 2:
//                case 3:
//                case 4:
//                    System.out.println("i is less than 5");
//                    break;
//                case 5:
//                case 6:
//                case 7:
//                case 8:
//                case 9:
//                    System.out.println("i is less than 10");
//                    break;
//                default:  System.out.println("i is greater than 10");
//            }

        // This the enhanced default version of missing breaks
//            switch (i){
//                case 0, 1, 2, 3, 4:
//                    System.out.println("i is less than 5");
//                    break;
//                case 5, 6, 7, 8, 9:
//                    System.out.println("i is less than 10");
//                    break;
//                default:  System.out.println("i is greater than 10");
//            }
            
            //This is the newly enhanced version of the missing breaks.
            switch (i) {
                case 0, 1, 2, 3, 4 -> System.out.println("i is less than 5");
                case 5, 6, 7, 8, 9 -> System.out.println("i is less than 10");
                default -> System.out.println("i is greater than 10");
            }
    }
}
