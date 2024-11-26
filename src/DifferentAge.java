import java.util.Scanner;

public class DifferentAge {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("That categorize the person of different age : " );
        Scanner Age = new Scanner ( System.in );
        System.out.print ("Enter the age : " );
        int a = Age.nextInt ( );
        if (a<5){
            System.out.print ("Children" );
        } else if (a<20) {
            System.out.print ("Teenage" );
        } else if (a<60) {
            System.out.print ("Adult" );
        }else {
            System.out.print ("Senior" );
        }
    }
}
