package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop.ForEach;
// Use break with the for-each style for-loop
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] numb = { 1,2,3,4,5,6,7,8,9,10 }; // See the String[] args style inside the main
        // use for-loop o display and sum the values
        for (int x: numb){
            System.out.println("Value is "+x);
            sum += x;
            if (x==5) break; // Stop the loop When 5 is obtained.

        }
        System.out.println("Summation of first 5 elements: "+ sum);

    }
}
