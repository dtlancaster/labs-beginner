import java.util.Scanner;
/**
 * Activity1PayStub class is part of Lab 3 and
 * creates a simple pay stub.
 *
 * @author Dylan Lancaster
 * @version 09/25/2019
 */
public class Activity1PayStub
{
    public static final double OVERTIME_RATE = 1.5;
    public static final double SS_RATE = 0.1;
    public static final double TAX_RATE = 0.2;
    /**
     * It all starts with the main method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        
        /*String employeeName = "Tim Buctoo";
        String ssn = "111-11-1112";
        int hoursWorked = 40;
        int otHoursWorked = 15;
        double hourlyPayRate = 15.5;*/
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        
        System.out.print("Enter social security number: ");
        String ssn = scanner.nextLine();
        
        System.out.print("Enter hours worked: ");
        int hoursWorked = scanner.nextInt();
        
        System.out.print("Enter overtime hours worked: ");
        int otHoursWorked = scanner.nextInt();
        
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = scanner.nextDouble();
        
        
        double regularPay = hoursWorked * hourlyPayRate;
        double overtimePayRate = hourlyPayRate * OVERTIME_RATE;
        double overtimePay = otHoursWorked * overtimePayRate;
        double grossPay = regularPay + overtimePay;
        double ssWithholding = grossPay * SS_RATE;
        double federalTax = (grossPay - ssWithholding) * TAX_RATE;
        double netPay = grossPay - (ssWithholding + federalTax);
        
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
    }
    
    /**
     * Print a horizontal rule.
     */
    public static void printRule()
    {
        for (int i = 0; i < 60; i++)
        {
            System.out.print("_");
        }
        System.out.print("\n");
    }
}
