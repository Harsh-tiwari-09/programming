import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
Radhe ();
    }
    public static void Radhe (){
        System.out.println ("Radhe radhe " );
        System.out.println ("Calculator a factorial " );
        Scanner number = new Scanner ( System.in );
        System.out.println ("Enter the number " );
        int n = number.nextInt ( );
       long fact =  factorial (n);
        System.out.println ("factorial is :"+fact );
    }
    public static long factorial(int n){
  if (n<2){
      return 1;
        }
        long fact = 1;
        int i = 2;
        while (i<=n){
            fact*=i;
            i++;
        }
return fact;
    }
}
