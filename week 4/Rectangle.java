public class Rectangle 
{
    private double width;
    private double height;
    private double side = 0.0;
    private double Area;
    private double Perimeter;
    
    Rectangle()
    {
        System.out.println("constructor called: object created!");
        this.width = 1;
        this.height = 1;

    }

    Rectangle(double width,double height)
    {
        if(width < 0 || height < 0)
        {
            System.out.println("cannot enter -ve values in dimensions! enter valid values of dimensions");
            return;
        }
        System.out.println("constructor called: object created!");
        this.width = width;
        this.height = height;

    }

   Rectangle(double side)
    {
        if(side < 0)
        {
            System.out.println("cannot enter -ve values in dimensions! enter valid values of dimensions");
            return;
        }
        System.out.println("constructor called: object created!");
        this.side = side;
        

    }

    double getArea()
    {

        Area = height*width;
        System.out.println(Area);
        return Area;
    }

    double getPerimeter()
    {
        Perimeter = 2*(width*height);
        System.out.println(Perimeter);
        return Perimeter;
    }

    boolean isSquare()
    {
        if(side == 0.0)
            return false;

        return true;
    }

    void scale(double factor)
    {
        height= height*factor;   
        width= width*factor; 
        Area= height*width;
        Perimeter= 2*(width*height);
        System.out.println(height);
        System.out.println(width);
        System.out.println(Area);
        System.out.println(Perimeter);
    }
    
    @Override
    public String toString() {
        return String.valueOf(width);
    }
}
