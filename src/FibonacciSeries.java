import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to Fibonacci Series World " );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter the number " );
        int n = number.nextInt ( );
        System.out.println ("Fibonacci Series "  );
        fibonacciSeries (n);


    }
    public static void fibonacciSeries(int n){
       if (n<0) return;
        System.out.print ("0 " );
        if (n==0) return;
        System.out.print ("1 " );
        int a = 0, b = 1;
        while (a+b<=n){
            int c = a+b;
            System.out.print ( c+" " );
            a = b;
            b = c;

        }
    }
}
