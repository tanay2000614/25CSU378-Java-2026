import java.util.Scanner;

public class DIGITEXTRACTION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 3 digit no: ");
        int num = scanner.nextInt();

        int hund = num / 100;
        int tens = (num % 100) / 10;
        int ones = num % 10;

        System.out.println( hund);
        System.out.println(tens);
        System.out.println(ones);

        scanner.close();
    }
}