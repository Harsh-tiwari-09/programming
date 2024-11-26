import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Radhe ();
        Number ();

    }
    public static void Radhe() {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome to Table " );
    }
    public static void Number() {
        Scanner number = new Scanner ( System.in );
        System.out.print ( "Enter the number " );
        int t = number.nextInt ( );
        table (t );
    }
    public static void table( int t){
        int i = 1;
        while (i<=10){
            System.out.println (t+ "X" + i +"=" + t*i);
            i++;


    }
}
}