import java.util.Scanner;
public class LCM{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter two numbers :");

        int a = Sc.nextInt();
        int b = Sc.nextInt();

        int x=a;
        int y=b;

        while(y!= 0 ){

            int temp = y;
            y = x % y;
            x = temp;
        }
          int GCD= x;
        int  LCM = (a * b)/ GCD;


    System.out.println("LCM =" + LCM);
}}