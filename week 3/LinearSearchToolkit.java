public class LinearSearchToolkit {

    static boolean contains(int[] values, int target){

        boolean isContains = false;
        for(int i=0; i<values.length; i++)
        {
            if(values[i] == target)
            {
                isContains = true;
            }
            
        }
        return isContains;

    }

    static int firstIndexOf(int[] values, int target)
    {
        int firstIndex = -1;

        for(int i = 0; i<values.length; i++)
        {
            if(values[i] == target)
            {
                firstIndex = i;
                break;
            }
        }
        return firstIndex;

    }

    static int lastIndexOf(int[] values, int target)
    {
        int lastIndex = -1;
        for(int i = values.length-1; i>=0; i--)
        {
            if(values[i] == target)
            {
                lastIndex = i;
                break;
            }
        }
        return lastIndex;
    }
    
    static int countOccurrences(int[] values, int target)
    {
        int targetCount = 0;

        for(int i = 0; i<values.length; i++)
        {
            if(values[i] == target)
            {
                targetCount++;
                
            }
        }
        return targetCount;
    }
}
