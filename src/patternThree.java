import java.util.Scanner;

public class patternThree {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ("Welcome the world of pattern " );
        Scanner rows = new Scanner ( System.in );
        System.out.println ("Enter the number of rows " );
        int n = rows.nextInt ();
        firstPattern ( n );
        System.out.println ("Second Pattern : " );
        secondPattern (n);
        System.out.println ("Third Pattern : " );
        thirdPattern ( n );
    }
    public static void firstPattern(int n){
        int rows =0;
        while (rows<n){
            System.out.print ("*" );
            int i = 0;
            while (i<rows){
                System.out.print (" *" );
                i++;

            }
            System.out.println ( );
rows++;
    }

    }
    public static void secondPattern(int n){

        int rows =n;
        while (rows>0){
            System.out.print ("*" );
            int i =1;
            while (i<rows){
                System.out.print (" *" );
                i++;

            }
            System.out.println ( );
            rows--;
        }

    }
    public static void thirdPattern(int n){

        int rows =n;
        while (rows>0){

            int j = 0;
            while (j<rows){
                System.out.print ("  ");
                j++;
            }
            int i =0;
            while (i<=(n-rows)){
                System.out.print ("* " );
                i++;

            }
            System.out.println ( );
            rows--;
        }

    }
}
