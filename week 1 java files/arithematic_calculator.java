import java.util.Scanner;

public class arithematic_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first: ");
        int x = scanner.nextInt();
        System.out.print("second: ");
        int y = scanner.nextInt();

        int sum = x + y ;
        int difference = x - y;
        int product = x * y;
        int quotient = x / y;
        int remainder = x % y;

     
        System.out.println("sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
        System.out.println("remainder: " + remainder);

        scanner.close();
    }
}
