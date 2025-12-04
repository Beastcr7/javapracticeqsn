import java.util.Scanner;

public class Reminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int rem = a % b;

        System.out.println("Remainder = " + rem);
    }
}
