
/**
 * TeamLeader.
 * 
 * @author Dylan Lancaster
 * @version 12/03/2019
 */
public class TeamLeader extends ProductionWorker
{
    private int trainingHours;
    private double weeklyBonus;

    /**
     * No-arg constructor for TeamLeader.
     */
    public TeamLeader()
    {
        setTrainingHours(10);
        setWeeklyBonus(50.0);
    }

    /**
     * Arg constructor for TeamLeader.
     * @param name name
     * @param idNumber idNumber
     * @param hireDate hireDate
     * @param shift shift
     * @param hourlyPayRate hourlyPayRate
     * @param hoursWorked hoursWorked
     * @param trainingHours trainingHours
     * @param weeklyBonus weeklyBonus
     */
    public TeamLeader(String name, String idNumber, String hireDate,
        ShiftType shift, double hourlyPayRate, double hoursWorked,
        int trainingHours, double weeklyBonus)
    {
        super(name, idNumber, hireDate, shift, hourlyPayRate, hoursWorked);
        setTrainingHours(trainingHours);
        setWeeklyBonus(weeklyBonus);
    }

    /**
     * Accessor for trainingHours.
     * @return trainingHours
     */
    public int getTrainingHours()
    {
        return this.trainingHours;
    }
    
    /**
     * Mutator for trainingHours.
     * @param trainingHours trainingHours
     */
    public void setTrainingHours(int trainingHours)
    {
        if (trainingHours < 0)
        {
            this.trainingHours = 0;
        }
        else if (trainingHours > 40)
        {
            this.trainingHours = 40;
        }
        else
        {
            this.trainingHours = trainingHours;
        }
    }

    /**
     * Accessor for weeklyBonus.
     * @return weeklyBonus
     */
    public double getWeeklyBonus()
    {
        return this.weeklyBonus;
    }
    
    /**
     * Mutator for weeklyBonus.
     * @param weeklyBonus weeklyBonus
     */
    public void setWeeklyBonus(double weeklyBonus)
    {
        if (weeklyBonus < 0.0)
        {
            this.weeklyBonus = 0.0;
        }
        else if (weeklyBonus > 1000.0)
        {
            this.weeklyBonus = 1000.0;
        }
        else
        {
            this.weeklyBonus = weeklyBonus;
        }
    }

    /**
     * Convert to string.
     * @return string
     */
    public String toString()
    {
        String appendix = String.format(" Training Hours:%d Bonus:%.2f",
                                        getTrainingHours(), getWeeklyBonus());
        return super.toString() + appendix;
    }

    /**
     * Computer weekly pay.
     * @return pay
     */
    public double computeWeeklyPay()
    {
        return super.computeWeeklyPay() + getWeeklyBonus();
    }
}
