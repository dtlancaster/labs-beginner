
/**
 * Write a description of class StudentDemo here.
 * 
 * @author Dylan Lancaster
 * @version 10/23/2019
 */
public class Student
{
    private String studentName;
    private int credits;
    private double averageGrade;

    /**
     * Arg constructor for Student.
     * @param n studentName
     * @param c credits
     * @param a averageGrade
     */
    public Student(String n, int c, double a)
    {
        System.out.println("name: " + n + " credits: " + c + " grade: " + a);
        setStudentName(n);
        setCredits(c);
        setAverageGrade(a);
    }

    /**
     * Accessor for studentName.
     * @return studentName
     */
    public String getStudentName()
    {
        return studentName;
    }

    /**
     * Accessor for credits.
     * @return credits
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * Accessor for averageGrade.
     * @return averageGrade
     */
    public double getAverageGrade()
    {
        return averageGrade;
    }

    /**
     * Mutator for studentName.
     * @param n new studentName
     */
    public void setStudentName(String n)
    {
        studentName = n;
    }

    /**
     * Mutator for credits.
     * @param c new credits
     */
    public void setCredits(int c)
    {
        credits = c;
    }

    /**
     * Mutator for averageGrade.
     * @param a new averageGrade
     */
    public void setAverageGrade(double a)
    {
        averageGrade = a;
    }

    /**
     * Calculate letter grade.
     * @return letterGrade
     */
    public char letterGrade()
    {
        double averageGrade = getAverageGrade();

        if (averageGrade < 60.0)
        {
            return 'F';
        }
        else if (averageGrade < 70.0)
        {
            return 'D';
        }
        else if (averageGrade < 80.0)
        {
            return 'C';
        }
        else if (averageGrade < 90.0)
        {
            return 'B';
        }
        else
        {
            return 'A';
        }
    }

    /**
     * Create string "passing" or "failing".
     * @param ch letter grade
     * @return hasPassed
     */
    public String hasPassed(char ch)
    {
        switch (ch)
        {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                return "passing";
            case 'F':
                return "failing";
            default:
                System.out.println("Not a letter grade");
                return "";
        }
    }

    /**
     * Calculate grade credits.
     * @param required number of required credits
     * @return gradeCredits
     */
    public double gradeCredits(int required)
    {
        int credits = getCredits();
        double averageGrade = getAverageGrade();
        double gradeCredits = averageGrade * Math.min(credits, required);

        if (credits > required)
        {
            // Make extra credits count 1.25 times more than required ones
            gradeCredits += (averageGrade * (credits - required) * 1.25);
        }

        return gradeCredits;
    }
}
