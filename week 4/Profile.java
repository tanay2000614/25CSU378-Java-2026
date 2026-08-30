public class Profile 
{
    private String name;
    private int age;
    private double heightMetres;

    Profile(String name, int age, double heightMetres)
    {
        System.out.println("constructor called: object created!");

        if(name == null || name.trim().isEmpty())
        {
            System.out.println("Invalid name");
            this.name = "unnamed";
        }
        else
            this.name = name;

        if(age < 0)
        {
            System.out.println("Invalid age");
            this.age = 0;
        }
        else
            this.age = age;

        if(heightMetres <= 0)
        {
            System.out.println("Invalid height");
            this.heightMetres = 1.0;
        }
        else
            this.heightMetres = heightMetres;
    }

    String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    double getHeightMetres()
    {
        return heightMetres;
    }

    @Override
    public String toString()
    {
        return "Profile[name=" + name + ", age=" + age + ", height=" + heightMetres + "m]";
    }
}
