import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to prime number world " );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter the number " );
        int n = number.nextInt ( );
boolean prime = primeNumber (n);
if (prime){
    System.out.println ("IS prime number " );
}else {
    System.out.println ("Not prime " );
}
    }
    public static boolean primeNumber(int n){
        int i = 2;
        while (i<n){
            if (n%i==0){
               return false;
            }
            i++;
        }
return true;
    }
}
