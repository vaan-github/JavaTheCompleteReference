package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop.ForEach;

// Use for-each style on a two-dimensional array
public class ForEach3 {
    public static void main(String[] args) {
        int sum =0;
        int[][] numb = new int[3][5];
        // Giving numb some values
        for (int i=0;i<3;i++)
            for (int j=0;j<5;j++)
                numb [i][j] = (i+1)*(j+1); // This line will print the table (table of 1)*(multiply by 1)
// Use for-each for-loop to display and sum the values
        System.out.print("Tables of 1 2 3\n");
        for (int[] x : // In the book c-style array declaration is made.
                numb) {
            System.out.println();
            for (int y :
                    x) {
                System.out.println("Value is: " +y);
                sum+=y;
            }
        }
        System.out.println();
        System.out.println("Summation: "+ sum);
    }
}
