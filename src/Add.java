import java.util.Scanner;

public class Add {
    public static void main (String[] args){

        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter two numbers :");

        int a = Sc.nextInt();
        int b = Sc.nextInt();

        int Sum = a+b;

        System.out.println("Sum =" +Sum);


    }
}