import java.util.Scanner;


public class GradingSystem
{
    public char grade()
    {
        //take input from user here;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter marks: ");
        double marks = scanner.nextDouble();
        char grade = 'U';
        

        if(marks<50 && marks>=0)
        {
            System.out.println("Fail!");
            grade = 'F';
        }
        else if(marks<70 && marks>=50)
        {
            System.out.println("Pass: B");
            grade = 'B';

        }
        else if(marks<80 && marks>=70)
        {
            System.out.println("merit A");
            grade = 'A';
        }
        else if(marks>=80 && marks<=100)
        {
            System.out.println("Distinction: S");
            grade = 'S';
        }
        else
        {
            System.out.println("Enter a valid number!");
        }
        return grade;
    }
 }

