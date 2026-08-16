public class GreatestCommonDivisor {

    public static int gcd(int a, int b)
    {
        a=Math.abs(a);
        b=Math.abs(b);
        int r=0;

        
        while(b!=0)
        {
           
            r = a%b;
            a = b;
            b = r;
        }

        return a;


    }
    
}
