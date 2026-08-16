public class NumberReversal {
    
    public static int Rev(int no)
    {
        int r=0;
        int digit = 0;

        while(no!=0)
        {
            digit = no % 10;
            r= r*10 + digit;
            no = no/10;
        }

        return r;
    }

}
