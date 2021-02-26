import java.util.Scanner;
import java.text.NumberFormat;

/**
 * ISP main.
 * 
 * @author Alex Wohlbruck
 * @version 10/16/2019
 */

public class ISPMain
{
    /**
     * Main method.
     * @param args not used
     */
    public static void main(String[] args)
    {
        char pkg;
        double hoursUsed;
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        System.out.println("");
        System.out.println("Enter package selection");
        pkg = sc.nextLine().charAt(0);
        
        if (pkg == 'A' || pkg == 'B')
        {
            System.out.println("Enter number of hours of access used.");
            hoursUsed = sc.nextDouble();
        }
        else
        {
            hoursUsed = 0.0;
        }
        
        ISP isp = new ISP(pkg, hoursUsed);

        System.out.println("Total charges: "
                            + formatter.format(isp.calculateCharges()));

        isp.printSavings();

    }
}
