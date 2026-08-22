public class BitMaskUtility 
{
    static boolean isBitSet(int n, int p) 
   {
        int m = 1 << p;
        if((n & m) != 0) 

        {
            return true;
        }

        return false;
    }

    static int setBit(int n, int p) 
    {

        int m = 1 << p;
        int res = n | m;

        return res;

    }

    static int clearBit(int n, int p) 
    {

        int m = ~(1 << p);
        int res = n & m;

        return res;
    }

    static int toggleBit(int n, int p) 
    {

        int m = 1 << p;
        int res = n ^ m;

        return res;

    }

    static String toBinary32(int n) 
    {

        String ans = "";
        for(int i = 31; i >= 0; i--) {
            int b = (n >> i) & 1;
            ans = ans + b;
        }
        return ans;

    }
}
