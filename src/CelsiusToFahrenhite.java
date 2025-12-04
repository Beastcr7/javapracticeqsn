import java.util.Scanner;

public class CelsiusToFahrenhite{
    public static void main (String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the value of Celsius :");

        double C = Sc.nextDouble();

        double Fahrenhite = (C*9/5)+32;

        System.out.println("Fahrenhite " + Fahrenhite);

    }
}