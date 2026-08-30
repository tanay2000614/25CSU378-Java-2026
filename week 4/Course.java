public class Course 
{
    private String courseCode;
    private String title;
    private int capacity;
    private int enrolledCount;

    Course(String courseCode, String title, int capacity)
    {
        System.out.println("constructor called: object created!");
        this.courseCode = courseCode;
        this.title = title;

        if(capacity <= 0)
        {
            System.out.println("Invalid capacity! Must be positive.");
            this.capacity = 1;
        }
        else
            this.capacity = capacity;

        this.enrolledCount = 0;
    }

    boolean enroll()
    {
        if(isFull())
        {
            System.out.println("Course is full; cannot enroll");
            return false;
        }
        enrolledCount++;
        return true;
    }

    boolean withdraw()
    {
        if(enrolledCount <= 0)
        {
            System.out.println("No students enrolled; cannot withdraw");
            return false;
        }
        enrolledCount--;
        return true;
    }

    boolean isFull()
    {
        return enrolledCount >= capacity;
    }

    int getAvailableSeats()
    {
        return capacity - enrolledCount;
    }

    String getCourseCode()
    {
        return courseCode;
    }

    String getTitle()
    {
        return title;
    }

    int getCapacity()
    {
        return capacity;
    }

    int getEnrolledCount()
    {
        return enrolledCount;
    }

    @Override
    public String toString()
    {
        return "Course[code=" + courseCode + ", title=" + title + ", enrolled=" + enrolledCount + "/" + capacity + "]";
               
    }
}
