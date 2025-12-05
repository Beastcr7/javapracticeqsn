import java.util.Scanner;

public class Largesthree {

    public static void main (String[]args){

        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter first number :");
        int a = Sc.nextInt();

        System.out.print("Enter second number :");
        int b = Sc.nextInt();

        System.out.print("Enter third number :");
        int c = Sc.nextInt();

        if(a>=b && a>=c) {
            System.out.println("Largest=" +a);
        }
        else if(b>=a && b>=c) {
            System.out.println("Largest =" +b);
        }
        else {
            System.out.println("Largest =" +c);
        }
    }


}
