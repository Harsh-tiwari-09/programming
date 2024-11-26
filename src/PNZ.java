import java.util.Scanner;

public class PNZ {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Determines if a number is positive , negative  or zero :" );
        Scanner Number = new Scanner ( System.in );
        System.out.print(" Enter the number : " );
        int n = Number.nextInt ();
        if (n>0){
            System.out.println ("Given number is positive " );
        } else if (n<0) {
            System.out.println (" Given number is negative " );

        }else {
            System.out.println ("Given number is zero " );
        }
    }
}
