package Part1_The_Java_Language.Chap5.Control_Statements.IterationStatements.ForLoop.ForEach;
// The for-each loop is essentially read-only

public class NoChange {
    public static void main(String[] args) {
        int[] numb = { 1,2,3,4,5,6,7,8,9,10 };
        for (int x :       // this is the iterable variable
                numb) {     // this is the collection(here we used the collection named array)
            System.out.println(x+ "");
            x=x*10; // Here we are altering the value of the x(iterable variable) but this effect at all
        }
        System.out.println(); // we are using the below loop to check that is the value altered in the collection
        for (int x :
                numb) {
            System.out.print(x+" ");
            System.out.println();
        }
    }
}
