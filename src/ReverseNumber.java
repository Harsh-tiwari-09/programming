import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to world of reverse" );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter the number " );
        int n = number.nextInt ( );
        int reverse = reverseNo (n);
        System.out.println ("Reverse of digits : " +reverse );
    }
    public static int reverseNo (int n){
        int reverse = 0;
        while (n>0){
int digit = n%10;
reverse = reverse*10+digit;
n/=10;


        }
        return reverse;
    }
}
