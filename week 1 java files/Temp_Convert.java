import java.util.Scanner;

public class Temp_Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("enter in celsius: ");
        double c = scanner.nextDouble();
        double f = c * 9.0 / 5.0 + 32.0;
        System.out.println("converted: " + f );

        scanner.close();
    }
}
