import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println ( "Radhe radhe " );
        System.out.println ( "Welcome to the world of Palindrome " );
        Scanner number = new Scanner ( System.in );
        System.out.println ( "Enter the number " );
        int n = number.nextInt ( );
        boolean reverse = reverseNo ( n );
        if (reverse) {
            System.out.println ("Given number is Palindrome Number " );
        }else {
            System.out.println ("Given number is not Palindrome Number " );
        }
    }
    public static boolean reverseNo (int n){
        int reverse = 0;
        int A = n;
        while (n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n/=10;


        }
        return reverse == A;
    }
}
