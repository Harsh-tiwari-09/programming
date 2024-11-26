import java.util.Scanner;

public class BitewiseEvenOdd {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Bitwise operation Even & Odd " );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter the number : " );
        int n = number.nextInt ( );
        if ((n&1)==0){
            System.out.println ("Even " );
        }else {
            System.out.println ("odd " );
        }
    }
}
