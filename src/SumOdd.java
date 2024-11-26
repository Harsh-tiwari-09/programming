import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Sum of all odd number " );

        Scanner number = new Scanner ( System.in );
        System.out.print ("Enter the number " );
        int n = number.nextInt ( );
        int sum =    sumOdd (n);
        System.out.println ("Odd till : "+n+ " is :  "+ sum );

    }
    public static int sumOdd(int n){
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum+=i;
            i+=2;
        }
return sum;
    }
}
