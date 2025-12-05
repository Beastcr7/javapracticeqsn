import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int n = Sc.nextInt();
        int rev =0;


        while(n>0) {

            int digit = n % 10;
             rev = rev * 10 + digit;
              n = n/10;


        }
        System.out.println("reverse = " +rev);

    }
        }