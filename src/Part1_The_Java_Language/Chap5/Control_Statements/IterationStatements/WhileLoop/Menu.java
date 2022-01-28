package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.WhileLoop;
// Using a do-while to process a menu selection.
public class Menu {
    public static void main(String[] args) throws java.io.IOException {
     char choice;
     do {
         System.out.println("Help on:");
         System.out.println("1. if ");
         System.out.println("2. Switch");
         System.out.println("3. while");
         System.out.println("4. do-while ");
         System.out.println("5. for \n");
         System.out.println("Choose one: ");
         choice= (char) System.in.read();  // This is also used for taking input
     }while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch (choice) {
            case '1' -> {
                System.out.println("The if :\n");
                System.out.println("if (condition) statement");
                System.out.println("else statement;");
            }
            case '2' -> {
                System.out.println("The Switch: \n");
                System.out.println("switch (expression){");
                System.out.println("case constant:");
                System.out.println("statement sequence");
                System.out.println("break;");
                System.out.println("//.....");
                System.out.println("}");
            }
            case '3' -> {
                System.out.println("The while: \n");
                System.out.println("while (condition) statement;");
            }
            case '4' -> {
                System.out.println("The do-while: \n");
                System.out.println("do{");
                System.out.println("statement;");
                System.out.println("}while(condition);");
            }
            case '5' -> {
                System.out.println("The for: \n");
                System.out.println("for(init; condition; iteration)");
                System.out.println("statement;");
            }
            default -> System.out.println("invalid input");
        }
//        switch (choice){
//            case '1':
//                System.out.println("The if :\n");
//                System.out.println("if (condition) statement");
//                System.out.println("else statement;");
//                break;
//
//            case '2':
//                System.out.println("The Switch: \n");
//                System.out.println("switch (expression){");
//                System.out.println("case constant:");
//                System.out.println("statement sequence");
//                System.out.println("break;");
//                System.out.println("//.....");
//                System.out.println("}");
//                break;
//
//            case '3':
//                System.out.println("The while: \n");
//                System.out.println("while (condition) statement;");
//                break;
//
//            case '4':
//                System.out.println("The do-while: \n");
//                System.out.println("do{");
//                System.out.println("statement;");
//                System.out.println("}while(condition);");
//                break;
//
//            case '5':
//                System.out.println("The for: \n");
//                System.out.println("for(init; condition; iteration)");
//                System.out.println("statement;");
//                break;
//            default:
//                System.out.println("invalid input");
//        }
    }
}
