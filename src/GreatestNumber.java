import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Greatest Number " );
        Scanner Number = new Scanner ( System.in );
        System.out.print ("Enter the first number : " );
        int a = Number.nextInt ( );
        System.out.print ("Enter the second number : " );
        int b = Number.nextInt ( );
        System.out.print ("Enter the third number : " );
        int c = Number.nextInt ( );
        if (a>=b && a>=c){
            System.out.println ("First greater than Second and Third " );
        } else if (b>=a && b>=c) {
            System.out.println ("Second greater than First and Third " );
        }else {
            System.out.println ("Third greater than First and Second " );
        }
    }
}
