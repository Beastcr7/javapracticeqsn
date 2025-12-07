import java.util.Scanner;

public class SumDigits{
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);

        System.out.print("Enter the value of n :");

        int n = Sc.nextInt();

        int sum = 0;

        while(n>0){

            int digit = n % 10 ;
            sum = sum +  digit;
            n = n / 10;
        }

        System.out.println("sum of digits = " + sum);
    }
}