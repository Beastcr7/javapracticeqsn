import java.util.Scanner;

public class AvgThree{

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter three numbers :");

        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c = Sc.nextInt();

        float avg = (a+b+c)/3;

        System.out.println("avg" + avg);



    }
}