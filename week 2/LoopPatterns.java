public class LoopPatterns {

    public static void pattern(int size)
    {

        //PATTERN A
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.print('*');
            }
        System.out.print("\n");
        }

        System.out.print("\n");

        //PATTERN B
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print('*');
            }
        System.out.print("\n");
        }

        System.out.print("\n");


        //PATTERN C
        for(int i=0; i<size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);

            }
        System.out.print("\n");
        }

        System.out.print("\n");


        //PATTERN D
        for(int i=0; i<size; i++)
        {
            for(int j=size-i; j>0; j--)
            {
                System.out.print('*');

            }
        System.out.print("\n");
        }

        System.out.print("\n");

        //PATTERN E

        for(int i=0; i<size; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);

            }
        System.out.print("\n");
        }
    }
    
}
