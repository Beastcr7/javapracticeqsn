import java.util.Scanner;

public class SumNatural{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the value of N :");

        int n = Sc.nextInt();
        int sum = 0;

        for(int i=1; i<=n; i++){
            sum += i;
    }
    System.out.println("sum =" +sum);
    }
}
