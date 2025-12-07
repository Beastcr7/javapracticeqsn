import java.util.Scanner;
public class GCD{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter two numbers :");

        int a = Sc.nextInt();
        int b = Sc.nextInt();

        while(b!= 0 ){

                int temp = b;
                b = a% b;
                a = temp;
        }

        System.out.println("GCD =" +a);
    }
}