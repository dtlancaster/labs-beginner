
/**
 * Employee.
 * 
 * @author Dylan Lancaster
 * @version 12/03/2019
 */
public class Employee
{
    private String name;
    private String idNumber;
    private String hireDate;
    private ShiftType shift;

    /**
     * No-arg constructor for Employee.
     */
    public Employee()
    {
        setName("");
        setIdNumber("");
        setHireDate("");
        setShift(ShiftType.DAY);
    }

    /**
     * Arg constructor for Employee.
     * @param name name
     * @param idNumber idNumber
     * @param hireDate hireDate
     * @param shift shift
     */
    public Employee(String name, String idNumber, String hireDate,
                    ShiftType shift)
    {
        setName(name);
        setIdNumber(idNumber);
        setHireDate(hireDate);
        setShift(shift);
    }

    /**
     * Accessor for name.
     * @return name
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Mutator for name.
     * @param name name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Accessor for idNumber.
     * @return idNumber
     */
    public String getIdNumber()
    {
        return this.idNumber;
    }

    /**
     * Mutator for idNumber.
     * @param idNumber idNumber
     */
    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }

    /**
     * Accessor for hireDate.
     * @return hireDate
     */
    public String getHireDate()
    {
        return this.hireDate;
    }
    
    /**
     * Mutator for hireDate.
     * @param hireDate hireDate
     */
    public void setHireDate(String hireDate)
    {
        this.hireDate = hireDate;
    }

    /**
     * Accessor for shift.
     * @return shift
     */
    public ShiftType getShift()
    {
        return this.shift;
    }
    
    /**
     * Mutator for shift.
     * @param shift shift
     */
    public void setShift(ShiftType shift)
    {
        this.shift = shift;
    }

    /**
     * Convert to string.
     * @return string
     */
    public String toString()
    {
        return "Name:" + getName() + " ID:" + getIdNumber() +
            " Hired:" + getHireDate() + " Shift:" + getShift();
    }

    /**
     * Computer weekly pay.
     * @return pay
     */
    public double computeWeeklyPay()
    {
        System.out.println("Other than when testing,"
            + "this method should never be called.");
        return 0.0;
    }
}
