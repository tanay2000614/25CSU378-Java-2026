import java.util.Scanner;

public class leapYear 
{

    public static boolean isLeapYear()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int Y = scanner.nextInt();
        boolean status=false;

        
        if(Y % 100 == 0 && Y % 400 != 0)
        {
            status = false;
        }
        else if(Y % 400 == 0)
        {
            status = true;
        }
        else if(Y % 4 == 0)
        {
            status = true;
        }
        else
        {
            status = false;
        }

        return status;
        

    }
    


}
