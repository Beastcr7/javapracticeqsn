import java.util.Scanner;

public class Calculator{
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the first number :");
        double a = Sc.nextDouble();

        System.out.print("Enter the second number :");
        double b = Sc.nextDouble();

        System.out.print("Enter (+,-,*,/) :");
        char op = Sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result =" + (a + b));
                break;


                    case'-':
                        System.out.println("Result =" +(a-b));
                        break;

                        case'*':
                            System.out.println("Result =" +(a*b));
                            break;

                            case'/':
                                System.out.println("Result =" +(a/b));
                                break;
                            default:
                                System.out.println("invalid operator :");

                }

        }



    }
