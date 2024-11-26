import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe  swap your number : " );
        Scanner input = new Scanner ( System.in );
        System.out.println ("First number : " );
        int a = input.nextInt ();
        System.out.println (" second  number : "  );
         int b = input.nextInt ( );
        int c = a;
        System.out.println (" swap :" );
        a = b;
        b= c;
        System.out.println ("first  " +a);
        System.out.println ("second "+ b );
    }
}
