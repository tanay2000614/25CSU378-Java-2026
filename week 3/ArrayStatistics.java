public class ArrayStatistics {

static int sum(int[] values) 
{
    if(values == null || values.length == 0) 
    {
        return 0;
    }

    int s = 0;

    for(int i = 0; i < values.length; i++) 
    {

    s = s + values[i];

    }
    return s;
}

static double average(int[] values)
{
    if(values == null || values.length == 0) 
    {

        return 0.0;
    }

    int totalVal = sum(values);
    double ans = (double)totalVal / values.length;
    return ans;

}

static int minimum(int[] values) 
{
    if(values == null || values.length == 0) 
    {

        return 0;

    }
    int m = values[0];
    for(int i = 1; i < values.length; i++) 
    {

        if(values[i] < m) 
        {

        m = values[i];

        }

    }

    return m;
}

static int maximum(int[] values) 
{
    if(values == null || values.length == 0) 
    {

        return 0;

    }

    int mx = values[0];
    for(int i = 1; i < values.length; i++) 
    {

        if(values[i] > mx) 
        {

        mx = values[i];

        }
    }
    return mx;
}

static int countEven(int[] values) 
{
    if(values == null || values.length == 0) 
    {

        return 0;

    }

    int c = 0;
    for(int i = 0; i < values.length; i++) 
    {

        if(values[i] % 2 == 0) 
        {

            c++;

        }
        
    }
    return c;
}

static void printSignCounts(int[] values) 
{
    if(values == null || values.length == 0) {
        System.out.println("Positive: 0, Negative: 0, Zero: 0");
        return;
    }

    int p = 0;
    int n = 0;
    int z = 0;

    for(int i = 0; i < values.length; i++) {
        if(values[i]>0) 
        {
            p++;
        } 
        else if(values[i]<0) 
        {
            n++;
        } 
        else 
        {
            z++;
        }
    }
    System.out.println("Positive:" + p + ",Negative: " + n + ",Zero: " + z);
}
    
    
}
