
/**
 * ShiftSupervisor.
 * 
 * @author Dylan Lancaster
 * @version 12/03/2019
 */
public class ShiftSupervisor extends Employee
{
    private double annualSalary;
    private double annualBonus;

    /**
     * No-arg constructor for ShiftSupervisor.
     */
    public ShiftSupervisor()
    {
        setAnnualSalary(25000.0);
        setAnnualBonus(1200.0);
    }

    /**
     * Arg constructor for ShiftSupervisor.
     * @param name name
     * @param idNumber idNumber
     * @param hireDate hireDate
     * @param shift shift
     * @param annualSalary annualSalary
     * @param annualBonus annualBonus
     */
    public ShiftSupervisor(String name, String idNumber, String hireDate,
                ShiftType shift, double annualSalary, double annualBonus)
    {
        super(name, idNumber, hireDate, shift);
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    /**
     * Accessor for annualSalary.
     * @return annualSalary
     */
    public double getAnnualSalary()
    {
        return this.annualSalary;
    }
    
    /**
     * Mutator for annualSalary.
     * @param annualSalary annualSalary
     */
    public void setAnnualSalary(double annualSalary)
    {
        if (annualSalary < 0.0)
        {
            this.annualSalary = 0.0;
        }
        else if (annualSalary > 50000.0)
        {
            this.annualSalary = 50000.0;
        }
        else
        {
            this.annualSalary = annualSalary;
        }
    }

    /**
     * Accessor for annualBonus.
     * @return annualBonus
     */
    public double getAnnualBonus()
    {
        return this.annualBonus;
    }
    
    /**
     * Mutator for annualBonus.
     * @param annualBonus annualBonus
     */
    public void setAnnualBonus(double annualBonus)
    {
        if (annualBonus < 0.0)
        {
            this.annualBonus = 0.0;
        }
        else if (annualBonus > 10000.0)
        {
            this.annualBonus = 10000.0;
        }
        else
        {
            this.annualBonus = annualBonus;
        }
    }

    /**
     * Convert to string.
     * @return string
     */
    public String toString()
    {
        String appendix = String.format(" Salary:%.2f Bonus:%.2f",
                                        getAnnualSalary(), getAnnualBonus());
        return super.toString() + appendix;
    }

    /**
     * Computer weekly pay.
     * @return pay
     */
    public double computeWeeklyPay()
    {
        return (getAnnualSalary() + getAnnualBonus()) / 52;
    }

}
