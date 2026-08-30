public class ScoreBox 
{
    private int score;

    ScoreBox()
    {
        System.out.println("constructor called: object created!");
        this.score = 0;
    }

    ScoreBox(int score)
    {
        System.out.println("constructor called: object created!");
        if(score < 0)
        {
            System.out.println("Invalid score! Cannot be negative.");
            this.score = 0;
        }
        else
            this.score = score;
    }

    boolean addPoints(int amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid amount; cannot add");
            return false;
        }
        score += amount;
        return true;
    }

    int getScore()
    {
        return score;
    }

    @Override
    public String toString()
    {
        return "ScoreBox[score=" + score + "]";
    }
}