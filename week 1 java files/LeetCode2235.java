import java.util.Scanner;

// this is the actual answer to the leetcode problem
public class LeetCode2235{
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // i had to add this to enter the values if the 2 numbers as leetcode automatically subs the values in the sum function and does not allow me to enter the values of the 2 numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c= sum(a, b);
        System.out.println(c);
        scanner.close();
    }
}