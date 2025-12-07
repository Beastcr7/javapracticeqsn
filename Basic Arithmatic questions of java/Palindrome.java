import java.util.Scanner;
public class Palindrome{
public static void main (String[]args){
    Scanner Sc = new Scanner(System.in);

    System.out.print("Enter the number :");

    int n = Sc.nextInt();

    int temp = n ;
    int rev = 0 ;

    while (temp > 0){

        int digit = temp % 10 ;
        rev = rev * 10 + digit;
        temp = temp / 10 ;

    }

    if (rev==n){
        System.out.println("The number is plaindrome :");
    }
    else{
        System.out.println("the number is not palindrome :");
    }


}
        }
