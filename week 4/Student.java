public class Student {
    
    private String name = "unnamed";
    private String studentId = "unallotted";
    private int mark = 0;

    Student()
    {
        System.out.println("constructor called: object created!");
    }

    Student(String name, String studentId, int mark)
    {
        this.name = name;
        this.studentId = studentId;
        this.mark = mark;
        System.out.println("constructor called: object created!");
    }

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        if(name == null || name.isEmpty())
        {
            System.out.println("invalid name");
            return;
        }
        else
            this.name = name;
    }

    String getId()
    {
        return studentId;
    }

    void setId(String studentId)
    {
        if(studentId == null || studentId.isEmpty())
        {
            System.out.println("invalid id");
            return;
        }
        else
            this.studentId = studentId;
    }

    int getMark()
    {
        return mark;
    }
    boolean setMark(int newMark)
    {
        if(newMark > 100 || newMark < 0)
        {
            System.out.println("Invalid marks entered! Pls enter correct marks.");
            return false;
        }
        else
        {
            this.mark = newMark;
            return true;
        }
    }

    boolean hasPassed()
    {
        if(mark>=40)
        {
            return true;
        }
        return false;
        
    }

    String getClassification()
    {
        if(mark < 40)
            return "Fail";
        else if(mark < 60 && mark >= 40)
            return "C";
        else if(mark < 80 && mark >= 60)
            return "B";
        else if(mark < 90 && mark >= 80)
            return "A";
        else
            return "A+";
    }

    @Override
    public String toString()
    {
        return String.valueOf(mark);
    }



}
