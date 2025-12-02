import java.util.Scanner;

public class subtract{

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter two numbers :");

        int a = Sc.nextInt();
        int b = Sc.nextInt();

        int Sub = a-b;

        System.out.println("sub =" +Sub);
    }
}