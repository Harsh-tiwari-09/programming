import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Marks on Grades Based : " );
        Scanner Marks = new Scanner ( System.in );
        System.out.print ("Enter your total Number : " );
        float m = Marks.nextFloat ( );
        System.out.print ("Enter your total subject :  " );
         int s = Marks.nextInt ( );
         if (m/s>=90){
             System.out.println ("A grade" );
         } else if (m/s>=75) {
             System.out.println ("B grade" );
         } else if (m/s>=60) {
             System.out.println ("C grade" );
         } else if (m/s>=30) {
             System.out.println ("D grade" );
         } else {
             System.out.println ("Fail" );
         }

    }
}
