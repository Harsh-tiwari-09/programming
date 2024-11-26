import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to GDC " );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter first number " );
        int a = number.nextInt ( );
        System.out.println ("Enter second number " );
        int b = number.nextInt ( );
        int gdc = Gdc (a,b);
        System.out.println ("GDC in  two number " + gdc );
    }
    public static int Gdc (int a, int b){
       int gcd =  1;
       int i = 2;
       int Least =least ( a,b );
       while (i<=Least ){
           if (a % i== 0 && b % i == 0){
           gcd =i;
           }

i++;
       }

return gcd;
    }
    public static int least (int a, int b){
        if(a<b){
            return a;

        }else {
            return b;
        }
    }
}
