import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[]args){

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the value of n :");

        int n = Sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(n + "x" + i + "=" +(n*i));
        }

    }
}