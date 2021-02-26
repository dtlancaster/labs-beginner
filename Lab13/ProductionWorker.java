
/**
 * ProductionWorker.
 * 
 * @author Dylan Lancaster
 * @version 12/03/2019
 */
public class ProductionWorker extends Employee
{
    private double hourlyPayRate;
    private double hoursWorked;

    /**
     * No-arg constructor for ProductionWorker.
     */
    public ProductionWorker()
    {
        setHourlyPayRate(7.25);
        setHoursWorked(40);
    }

    /**
     * Arg constructor for ProductionWorker.
     * @param name name
     * @param idNumber idNumber
     * @param hireDate hireDate
     * @param shift shift
     * @param hourlyPayRate hourlyPayRate
     * @param hoursWorked hoursWorked
     */
    public ProductionWorker(String name, String idNumber, String hireDate,
                ShiftType shift, double hourlyPayRate, double hoursWorked)
    {
        super(name, idNumber, hireDate, shift);
        setHourlyPayRate(hourlyPayRate);
        setHoursWorked(hoursWorked);
    }

    /**
     * Accessor for hourlyPayRate.
     * @return hourlyPayRate
     */
    public double getHourlyPayRate()
    {
        return this.hourlyPayRate;
    }
    
    /**
     * Mutator for hourlyPayRate.
     * @param hourlyPayRate hourlyPayRate
     */
    public void setHourlyPayRate(double hourlyPayRate)
    {
        if (hourlyPayRate < 7.25)
        {
            this.hourlyPayRate = 7.25;
        }
        else if (hourlyPayRate > 25)
        {
            this.hourlyPayRate = 25;
        }
        else
        {
            this.hourlyPayRate = hourlyPayRate;
        }
    }

    /**
     * Accessor for hoursWorked.
     * @return hoursWorked
     */
    public double getHoursWorked()
    {
        return this.hoursWorked;
    }
    
    /**
     * Mutator for hoursWorked.
     * @param hoursWorked hoursWorked
     */
    public void setHoursWorked(double hoursWorked)
    {
        if (hoursWorked < 0.0)
        {
            this.hoursWorked = 0.0;
        }
        else if (hoursWorked > 70.0)
        {
            this.hoursWorked = 70.0;
        }
        else
        {
            this.hoursWorked = hoursWorked;
        }
    }    

    /**
     * Convert to string.
     * @return string
     */
    public String toString()
    {
        String appendix = String.format(" Payrate:%.2f Hours:%.1f",
                                        getHourlyPayRate(), getHoursWorked());
        return super.toString() + appendix;
    }

    /**
     * Computer weekly pay.
     * @return pay
     */
    public double computeWeeklyPay()
    {
        double hoursWorked = getHoursWorked();
        double hourlyPayRate = getHourlyPayRate();

        if (hoursWorked <= 40)
        {
            return hoursWorked * hourlyPayRate;
        }
        else
        {
            return (40.0 * hourlyPayRate) +
                ((hoursWorked - 40.0) * (hourlyPayRate * 1.5));
        }
    }
}
