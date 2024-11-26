import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Number is Even or Odd " );
        Scanner Number = new Scanner ( System.in );
        System.out.print (" Enter the number : " );
        int n = Number.nextInt ();
        if (n%2== 0){
            System.out.println ("Given number is Even " );
        }else {
            System.out.println ("Given number is Odd " );
        }
    }
}
