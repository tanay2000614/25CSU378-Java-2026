import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("principal amnt: ");
        double p = scanner.nextDouble();

        System.out.print("annual interest rate: ");
        double r = scanner.nextDouble();

        System.out.print("time: ");
        double t = scanner.nextDouble();

        double SI = (p * r * t) / 100.0;
        double f_amnt = p + SI;

      
        System.out.println("simple interest: " + SI);
        System.out.println("final amount:    " + f_amnt);

        scanner.close();
    }
}
