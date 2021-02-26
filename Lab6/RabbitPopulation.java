
/**
 * Rabbit population class.
 * 
 * @author Alex Wohlbruck
 * @version 10/16/2019
 */
public class RabbitPopulation
{
    private int initialPopulation;
    private int sixMonthPopulation;

    /**
     * No-arg constructor.
     */
    public RabbitPopulation()
    {
        initialPopulation = 0;
        sixMonthPopulation = 0;
    }

    /**
     * Arg constuctor.
     * @param newInitialPopulation Initial population
     * @param newSixMonthPopulation Initial six-month population
     */
    public RabbitPopulation(int newInitialPopulation, int newSixMonthPopulation)
    {
        setInitialPopulation(newInitialPopulation);
        setSixMonthPopulation(newSixMonthPopulation);
    }

    /**
     * Find percent increase over 6 months.
     * @return growthRate
     */
    public double calculateGrowthRate()
    {
        double growthRate = ((double) sixMonthPopulation
                               / (double) initialPopulation) - 1.0;
                               
        System.out.println("Six month pop"
                            + sixMonthPopulation
                            + ", init pop: "
                            + initialPopulation);
        return growthRate;
    }

    /**
     * Predict population after 12 months.
     * @return estimatedPopulation
     */
    public int calculate12MonthPopulation()
    {
        double growthRate = calculateGrowthRate();
        int estimatedPopulation = (int) Math.round(sixMonthPopulation
                                                    * (growthRate + 1.0));
        
        System.out.println("Est pop: " + estimatedPopulation);

        return estimatedPopulation;
    }

    /**
     * Accessor for initialPopulation.
     * @return initialPopulation
     */
    public int getInitialPopulation()
    {
        return initialPopulation;
    }

    /**
     * Accessor for sixMonthPopulation.
     * @return sixMonthPopulation
     */
    public int getSixMonthPopulation()
    {
        return sixMonthPopulation;
    }

    /**
     * Mutator for initialPopulation.
     * @param newInitialPopulation new initial population
     */
    public void setInitialPopulation(int newInitialPopulation)
    {
        initialPopulation = Math.max(0, newInitialPopulation);
    }

    /**
     * Mutator for sixMonthPopulation.
     * @param newSixMonthPopulation new six-month population
     */
    public void setSixMonthPopulation(int newSixMonthPopulation)
    {
        sixMonthPopulation = Math.max(0, newSixMonthPopulation);
    }
}
