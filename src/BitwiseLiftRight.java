import java.util.Scanner;

public class BitwiseLiftRight {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Bitwise operation " );
        Scanner Number = new Scanner ( System.in );
        System.out.println ("Enter first number : " );
        int a = Number.nextInt ( );
         System.out.println ("Enter second number : " );
         int b = Number.nextInt (  );
        System.out.println ("Lift "+(a<<1) );
        System.out.println ("Right "+(b>>1) );
    }

}
