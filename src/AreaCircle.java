import java.util.Scanner;

public class AreaCircle{

    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the vlaue of r :");

        double r = Sc.nextInt();


        double area = Math.PI*r*r;

        System.out.println("area" + area);



    }
}