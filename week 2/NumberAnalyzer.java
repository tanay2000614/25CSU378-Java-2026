import java.util.Scanner;

public class NumberAnalyzer {

    public static int readNumber(Scanner input) {
        System.out.print("enter integer: ");
        int val = input.nextInt();
        return val;
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPositive(int number) {
        if (number > 0)
            return true;
        else
            return false;
    }

    public static int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        }
        return number;
    }

    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int c = 0;
        int temp = number;
        while (temp != 0) {
            temp = temp / 10;
            c++;
        }
        return c;
    }

    public static int sumDigits(int number) {
        int s = 0;
        int temp = number;
        while (temp != 0) {
            int d = temp % 10;
            s = s + d;
            temp = temp / 10;
        }
        return s;
    }

    public static void printReport(int number, boolean even, boolean positive, int digitCount, int digitSum) {
    
        System.out.println("Is Even: " + even);
        System.out.println("Is Positive: " + positive);
        System.out.println("Total Digits: " + digitCount);
        System.out.println("Sum of Digits: " + digitSum);
    }
}