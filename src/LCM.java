import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to LCM " );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter first number " );
        int a = number.nextInt ( );
        System.out.println ("Enter second number " );
        int b = number.nextInt ( );
        int lcm = Lcm (a,b);
        System.out.println (" LCM of two number " +lcm );
    }
    public static int Lcm (int a , int b){
        int i = 1;
        while (i<=b){
            int factor = a*i;
            if (factor%b==0){
                return factor;
            }
            i++;
        }

        return 0;

    }
}
