import java.util.Scanner;
public class LargestDigit{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the number :");

        int n = Sc.nextInt();

        int largest = 0;

                while (n > 0){
                    int digit = n % 10;
                    if (digit>largest)
                         largest = digit;
                    n = n/ 10 ;
                }
                System.out.println("largest digit is :" + largest);
    }
}