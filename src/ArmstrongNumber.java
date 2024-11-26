import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to the world of Armstrong Number " );
        Scanner Number = new Scanner ( System.in );
        System.out.print("Enter the Number " );
        int n = Number.nextInt ( );
      boolean armstrong = armstrong (n);
      if (armstrong){
          System.out.println (" Your number is Armstrong Number ");
      }else {
          System.out.println ("Your number is not Armstrong number " );
      }
    }
    public static boolean armstrong (int n){
        int F = sumDigits (n);
        int finalNumber = 0;
        int A = n;
        while (n>0){
            int S = n%10;
            n/=10;
            finalNumber+=power (S,F);

        }
        return finalNumber==A;


    }
    public static int power ( int f , int s){
        int result =f;
        int i = 1;
        while (i<s){
            result *= f;
            i++;

        }
        return result;

    }
    public static int sumDigits(int n){
        int digits = 0;
        while (n>0){
            digits++;
            n/=10;

        }
        return digits;
    }

}
