import java.util.Scanner;
/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author Dylan Lancaster
 * @version 09/25/2019
 */
public class PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_RATE = 0.1;
    public static final double TAX_RATE = 0.2;
    
    private String employeeName;
    private String ssn;
    private int hoursWorked;
    private int otHoursWorked;
    private double hourlyPayRate;
    
    private double regularPay;
    private double overtimePayRate;
    private double overtimePay;
    private double grossPay;
    private double ssWithholding;
    private double federalTax;
    private double netPay;
    
    
    /**
     * Get input and calculate pay on initialization.
     * 
     * @param keyboard keyboard input device
     */
    public PayStub(Scanner keyboard)
    {
        getInput(keyboard);
        keyboard.nextLine();
        calculate();
    }
    
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        PayStub homer = new PayStub(keyboard);
        PayStub marge = new PayStub(keyboard);
        PayStub lisa = new PayStub(keyboard);
        
        marge.display();
        marge.setPayRate(20.0);
        System.out.printf("New gross pay: $%-8.2f\n", marge.getGrossPay());
    }
    
    /**
     * Get inputs from the user.
     * 
     * @param keyboard keyboard input device
     */
    private void getInput(Scanner keyboard)
    {
        System.out.print("Enter employee name: ");
        employeeName = keyboard.nextLine();
        
        System.out.print("Enter social security number: ");
        ssn = keyboard.nextLine();
        
        System.out.print("Enter hours worked: ");
        hoursWorked = keyboard.nextInt();
        
        System.out.print("Enter overtime hours worked: ");
        otHoursWorked = keyboard.nextInt();
        
        System.out.print("Enter hourly pay rate: ");
        hourlyPayRate = keyboard.nextDouble();
    }
    
    /**
     * Calculate new values from input.
     */
    private void calculate()
    {
        regularPay = hoursWorked * hourlyPayRate;
        overtimePayRate = hourlyPayRate * OVERTIME_RATE;
        overtimePay = otHoursWorked * overtimePayRate;
        grossPay = regularPay + overtimePay;
        ssWithholding = grossPay * SS_RATE;
        federalTax = (grossPay - ssWithholding) * TAX_RATE;
        netPay = grossPay - (ssWithholding + federalTax);
    }
   
    
    /**
     * Print a horizontal rule.
     */
    private static void printRule()
    {
        for (int i = 0; i < 60; i++)
        {
            System.out.print("_");
        }
        System.out.print("\n");
    }
    
    /**
     * Print values after calculation.
     */
    public void display()
    {
        printRule();
        
        String format;
        
        format = "Name: %-37s SSN: %-11s\n";
        System.out.printf(format, employeeName, ssn);
        
        format = "Regular Hours: %-8d Reg Rate: $%-8.2f Reg Pay: $%-8.2f\n";
        System.out.printf(format, hoursWorked, hourlyPayRate, regularPay);
        
        format = "Overtime Hours: %-7d OT Rate: $%-9.2f OT Pay: $%-8.2f\n";
        System.out.printf(format, otHoursWorked, overtimePayRate, overtimePay);
        
        format = "Gross Pay: $%-8.2f\n";
        System.out.printf(format, grossPay);
        
        format = "SS Withholding: $%-8.2f\n";
        System.out.printf(format, ssWithholding);
        
        format = "Federal Tax: $%-8.2f\n";
        System.out.printf(format, federalTax);
        
        format = "Net Pay: $%-8.2f\n";
        System.out.printf(format, netPay);
        
        printRule();
        System.out.print("\n");
    }
    
    /**
     * Accessor for otHoursWorked.
     * 
     * @return otHoursWorked.
     */
    public int getOvertimeHoursWorked()
    {
        return otHoursWorked;
    }
    
    /**
     * Accessor for grossPay.
     * 
     * @return grossPay.
     */
    public double getGrossPay()
    {
        return grossPay;
    }
    
    /**
     * Mutator for otHoursWorked.
     * 
     * @param newValue the new value of otHoursWorked.
     */
    public void setOverTimeHoursWorked(int newValue)
    {
        if (newValue >= 0)
        {
            otHoursWorked = newValue;
            calculate();
        }
    }
    
    /**
     * Mutator for payRate.
     * 
     * @param newValue the new value of hourlyPayRate.
     */
    public void setPayRate(double newValue)
    {
        if (newValue >= 0)
        {
            hourlyPayRate = newValue;
            calculate();
        }
    }
}
