
import java.text.NumberFormat;

/**
 * ISP.
 * 
 * @author Dylan Lancaster
 * @version 10/16/2019
 */


public class ISP
{
    private char pkg;
    private double hoursUsed;

    private double packageARate = 9.95;
    private double packageBRate = 14.95;
    private double packageCRate = 19.95;

    private int packageAHours = 10;
    private int packageBHours = 20;
    private double packageCHours = Double.POSITIVE_INFINITY;
    
    /**
     * No-arg constructor.
     */
    public ISP()
    {
        pkg = 'A';
        hoursUsed = 0;
    }
    
    /**
     * Arg constructor.
     * @param newPkg Package letter
     * @param newHoursUsed Hours used
     */
    public ISP(char newPkg, double newHoursUsed)
    {
        pkg = newPkg;
        hoursUsed = newHoursUsed;
    }
    
    /**
     * Main method.
     * @param args not used
     */
    public static void main(String[] args)
    {
        
    }

    /**
     * Accessor for pkg.
     * @return pkg
     */
    public char getPkg()
    {
        return pkg;
    }

    /**
     * Accessor for hoursUsed.
     * @return hoursUsed
     */
    public double getHoursUsed()
    {
        return hoursUsed;
    }

    /**
     * Mutator for pkg.
     * @param newPkg new package
     */
    public void setPkg(char newPkg)
    {
        pkg = newPkg;
    }

    /**
     * Mutator for hoursUsed.
     * @param newHoursUsed new hoursUsed
     */
    public void setHoursUsed(double newHoursUsed)
    {
        hoursUsed = newHoursUsed;
    }
    
    /**
     * Calcuate charges based on package and hours.
     * @return charges
     */
    public double calculateCharges()
    {
        double charges;

        switch (pkg)
        {
            case 'A':
                charges = packageARate;

                if (hoursUsed > packageAHours)
                {
                    charges += ((hoursUsed - packageAHours) * 2.0);
                }
                break;
            case 'B':
                charges = packageBRate;
                
                if (hoursUsed > packageBHours)
                {
                    charges += ((hoursUsed - packageBHours) * 1.0);
                }
                break;
            case 'C':
                charges = packageCRate;
                break;
            default:
                charges = 0.0;
                break;
        }
        
        return Math.round(charges * 100.0) / 100.0;
    }

    /**
     * Print savings.
     */
    public void printSavings()
    {
        char originalPkg = getPkg();
        double originalCharge = calculateCharges();
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        char[] packages = {'A', 'B', 'C'};


        for (int i = 0; i < packages.length; i++)
        {
            setPkg(packages[i]);
            double charge = calculateCharges();

            if (charge < originalCharge)
            {
                System.out.println("You would have saved "
                                    + formatter.format(originalCharge - charge)
                                    + " by choosing package " + packages[i]);
            }
        }

        setPkg(originalPkg);
    }
}
