import java.util.Scanner;

public class FtoC{
    public static void main (String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the value of Celsius :");

        double F = Sc.nextDouble();

        double  C = (F-32)*5/9;

        System.out.println("Celsius " + C);

    }
}