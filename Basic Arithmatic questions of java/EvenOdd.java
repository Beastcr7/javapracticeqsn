import java.util.Scanner;

public class EvenOdd{
    public static void main(String[]args){
        Scanner Sc= new Scanner(System.in);

        System.out.print("Enter the number :");

        int a = Sc.nextInt();

        if(a%2==0) {
            System.out.println("Even =" + a);
        }
            else {
                System.out.println("odd ="+a);

        }
    }
}
