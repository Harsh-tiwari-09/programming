import java.util.Scanner;


public class simpleInterest {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("  Simple Interest " );
        Scanner input = new Scanner ( System.in );
        System.out.print ( "\n\n P : ");
float P = input.nextFloat ();
        System.out.print ( "T : ");
float T = input.nextFloat ( );
        System.out.print( "R : ");
        float R = input.nextFloat ( );
        float I = 100;
        System.out.println ((P*T*R)/I );
        System.out.println ("Compound Interest " );
        float H = 1+R/I;
        System.out.println (P*H*T );
    }
}
