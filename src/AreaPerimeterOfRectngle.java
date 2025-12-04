import java.util.Scanner;

public class AreaPerimeterOfRectngle{

    public static void main(String[] args){

        Scanner Sc= new Scanner(System.in);

        System.out.print("Enter length and breadth :");

        double l= Sc.nextInt();
        double b= Sc.nextInt();

        double area = l*b;
        double perimeter = 2*(l+b);

        System.out.println("area =" +area);
        System.out.println("perimeter =" +perimeter);
    }
}