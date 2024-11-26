import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println ("Radhe radhe " );
        System.out.println ( "Temperature Converter : ");
        Scanner Temperature = new Scanner ( System.in );
        System.out.print (" Temperature of Degree Celsius : " );
        int C = Temperature.nextInt ( );
        int K = C + 273;
        System.out.println (" Temperature in Kelvin : "+K );
        float f = C*9/5f;
        float F = f+ 32;
        System.out.println (" Temperature of Fahrenheit : "+F );


    }
}
