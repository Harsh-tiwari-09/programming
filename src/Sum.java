import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.println ( "Radhe Radhe our calculator: " );
        Scanner input = new Scanner ( System.in );
        System.out.println ( "Enter your first number : " );
        int a = input.nextInt ( );
        System.out.println ("Enter your second number : " );
        int b = input.nextInt ( );
        int sum = a + b;
        System.out.println ("sum of two number : " + sum);
    }
}
