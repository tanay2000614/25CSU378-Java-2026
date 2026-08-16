import java.util.Scanner;

public class FinalValueOperations {

    public static int calc() {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        System.out.print("how many operations: ");
        int n = scanner.nextInt();
        System.out.println("Enter the operations:");

        for (int i = 0; i < n; i++) {
            String op = scanner.next();
            if (op.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        
        System.out.println("X: " + x);
        return x;
    }
}