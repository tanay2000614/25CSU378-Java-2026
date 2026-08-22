public class MatrixOperations {

    int[] colSum(int[][] arr1)
    {
        int[] sum = new int[arr1[0].length];
        int SUM =0;

        for(int j=0; j<arr1[1].length; j++)
        {
            for(int i=0; i<arr1.length; i++)
            {
                SUM += arr1[i][j];
                
            }
            sum[j]=SUM;
            // System.out.println(SUM);
            SUM = 0;
        }

        return sum;

    }

    static int[][] multiply(int[][] arr1, int[][] arr2)
    {

        int[][] result = new int[arr1.length][arr2[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    result[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return result;
    }

    void rowSum(int[][] arr1)
    {
        int[] sum= new int[arr1[0].length];
        int SUM=0;
        
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                SUM+=arr1[i][j];
                
            }
            sum[i]=SUM;
            System.out.println(SUM);
            SUM=0;
        }

    }

    public int[][] ArrSum(int[][] arr1, int[][] arr2 )
    {
        int[][] sum = new int[arr1.length][arr1[0].length];

        for(int i =0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                sum[i][j] = arr1[i][j]+arr2[i][j];
            }
        }


        return sum;
    }
    


    
}
