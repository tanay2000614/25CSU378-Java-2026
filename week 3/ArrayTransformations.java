
import java.lang.reflect.Array;

public class ArrayTransformations {
    
    static void reverseInPlace(int[] values)
    {
        int temp = 0;

        for(int i = 0; i<values.length/2; i++)
        {
           
            temp = values[i];
            values[i] = values[values.length-1-i];
            values[values.length-1-i] = temp;
        }
            for(int j=0; j<values.length; j++)
            {
                System.out.print(values[j]);
            }
    }

    static int[] reversedCopy(int[] values)
    {
        int[] copy = new int[values.length];
        int j = 0;

        for(int i = values.length-1; i>=0;i--)
        {
            copy[j] = values[i];
            j++;
        }

        return copy;
    }

    static int removeValue(int[] values, int target) 
    {
     int writeIndex = 0;

     for (int readIndex = 0; readIndex < values.length; readIndex++) {
        if (values[readIndex] != target) {
            values[writeIndex] = values[readIndex];
            writeIndex++;
        }
    }

     return writeIndex;
    }

    static int[] runningSum(int[] values)
    {
        int sum = 0;
        int SUM[] = new int[values.length];
        for(int i=0; i<values.length; i++)
        {
           sum += values[i];
           SUM[i] = sum;
        }
        return SUM;
        
    }
}
//1 