import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Sum of digit in integer" );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter the number " );
        int n = number.nextInt ( );
        int Sum = sum (n);
        System.out.println (" Sum of digit " +Sum );
       }
public static int sum(int n){
        int sum = 0;
    while (n>0){
     sum+=n%10;
     n/=10;
    }
      return sum;
}
    }

