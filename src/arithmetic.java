import java.sql.SQLOutput;
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        System.out.println ("radhe radhe " );
        Scanner input = new Scanner ( System.in );
        System.out.print ("Enter first number : " );
        int a = input.nextInt ();
        System.out.print ("Enter second number : " );
        int b = input.nextInt (  );
        System.out.println ("Arithmetic opertion" );
        System.out.println (a + b );
        System.out.println (a-b );
        System.out.println (a*b);
        System.out.println (a%b );
        System.out.println (a/b );

    }
}
