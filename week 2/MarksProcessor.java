import java.util.Scanner;

public class MarksProcessor {

    public static void processMarks() {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = -1;
        int passes = 0;
        int fails = 0;
        System.out.println("Enter marks,Enter -1 to finish:");

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                System.out.println("Invalid mark: " + input + " (ignored, must be 0-100)");
                continue;
            }

            count++;
            sum += input;

            if (input > highest) {
                highest = input;
            }

            if (input >= 50) {
                passes++;
            } else {
                fails++;
            }
        }

      
        if (count == 0) {
            System.out.println("\nNo valid marks were entered.");
        } else {
            double average = (double) sum / count;


            System.out.println("Valid marks entered: " + count);
            System.out.println("Sum of marks: " + sum);
            System.out.printf("Average mark: %.2f\n", average);
            System.out.println("Highest mark: " + highest);
            System.out.println("Passes: " + passes);
            System.out.println("Failures: " + fails);
        }
    }

    public static void main(String[] args) {
        processMarks();
    }
}