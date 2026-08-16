import java.util.Scanner;

public class Calculator {

    public static double Calc()
    {
        double a=0;
        double b=0;
        Scanner scanner = new Scanner(System.in);
        double c = 0;
        int n = 0;


        do {
            System.out.println("1.product \n 2. divide \n 3.addition \n 4.difference \n 5. Exit");
            n=scanner.nextInt();

            switch(n)
            {
                case 1:
                    System.out.println("a:");
                    a=scanner.nextDouble();
                    System.out.println("b:");
                    b=scanner.nextDouble();
                    c= a*b;
                    System.out.println("ans:"+ c);
                    break;
                
                case 2:
                    System.out.println("a:");
                    a=scanner.nextDouble();
                    System.out.println("b:");
                    b=scanner.nextDouble();

                    if(b==0)
                    {
                        System.out.println("error: division by 0");
                        break;
                    }
                    c=a/b;
                    System.out.println("ans:"+ c);
                    break;
                
                case 3:
                    System.out.println("a:");
                    a=scanner.nextDouble();
                    System.out.println("b:");
                    b=scanner.nextDouble();
                    c=a+b;
                    System.out.println("ans:"+ c);
                    break;
                
                case 4:
                    System.out.println("a:");
                    a=scanner.nextDouble();
                    System.out.println("b:");
                    b=scanner.nextDouble();
                    c= a-b;
                    System.out.println("ans:"+ c);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("enter a valid operation!");
                    break;
            }
        }
        while (n!=5);
        return c;
    }
    
    
}
