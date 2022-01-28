package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop.ForEach;
// Use a for-each style for-loop
public class ForEach1 {
    public static void main(String[] args) {
        int[] numbs = { 1,2,3,4,5,6,7,8,9,10 };
        int sum = 0;
        // Use of for-each style for to display and sum the values
        for(int x: numbs){ // One value form the collection(array) is stored in the x at each loop
            System.out.println("Value is: " + x); // SHIFT + ENTER TO START FROM NEXT LINE
            sum += x;

        }
        System.out.println("Summation: " + sum);

    }
}
