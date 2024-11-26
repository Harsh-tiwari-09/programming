import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Leap Year " );
        Scanner Year = new Scanner ( System.in );
        System.out.print ("Enter year : " );
        int y = Year.nextInt ( );
        if (y%4==0){
            System.out.println ("Given Year is Leap Year " );
        }else {
            System.out.println ("Given Year is not a Leap Year " );
        }
    }
}
