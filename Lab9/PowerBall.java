import java.util.Random;

/**
 * The NC PowerBall Lottery has the following rules: Choose 5 numbers
 * between 1 and 59 (inclusive, no duplicates), plus one PowerBall
 * number between 1 and 35 (no restrictions).
 * 
 * @author Dylan Lancaster
 * @version 11/06/2019
 */
public class PowerBall
{
    public static final int MAX_LOTTERY_NUMBER = 59;
    public static final int MAX_POWER_BALL_NUMBER = 35;

    private Random randomGenerator;

    private int number0;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int powerBall;

    /**
     * No-arg constructor for PowerBall.
     */
    public PowerBall()
    {
        setRandomGenerator(new Random());
        setNumber0(0);
        setNumber1(0);
        setNumber2(0);
        setNumber3(0);
        setNumber4(0);
        setPowerBall(0);
    }

    /**
     * Returns a random integer between 1 and the maximum
     * lottery number (inclusive).
     * 
     * @return randomInt
     */
    public int generateLotteryNumber()
    {
        return randomGenerator.nextInt(MAX_LOTTERY_NUMBER) + 1;
    }

    /**
     * Returns a random integer between 1 and the maximum PowerBall
     * number (inclusive).
     * 
     * @return randomInt
     */
    public int generatePowerBallNumber()
    {
        return randomGenerator.nextInt(MAX_POWER_BALL_NUMBER) + 1;
    }

    /**
     * Return true if newNumber is equal to any of number0,
     * number1, number2, number3, and number4, return false otherwise.
     * 
     * @param newNumber newNumber
     * @return isDuplicateLotteryNumber
     */
    public boolean isDuplicateLotteryNumber(int newNumber)
    {
        return
            newNumber == getNumber0()
            || newNumber == getNumber1()
            || newNumber == getNumber2()
            || newNumber == getNumber3()
            || newNumber == getNumber4();
    }

    /**
     * Return a lottery number obtained using generateLotteryNumber.
     * Make sure the number returned is not already stored in
     * number0, number1, number2, number3, or number4.
     * 
     * @return nextLotteryNumber()
     */
    public int nextLotteryNumber()
    {
        int randomNumber = generateLotteryNumber();
        
        while (isDuplicateLotteryNumber(randomNumber))
        {
            randomNumber = generateLotteryNumber();
        }

        return randomNumber;
    }

    /**
     * Sets number0, number1, number2, number3, number4, 
     * and powerBall to 0.
     */
    public void reset()
    {
        setNumber0(0);
        setNumber1(0);
        setNumber2(0);
        setNumber3(0);
        setNumber4(0);
        setPowerBall(0);
    }

    /**
     * Calls reset, then generates values for number0, number1,
     * number2, number3, number4, and powerBall.
     */
    public void generateLotteryPicks()
    {
        reset();
        setNumber0(nextLotteryNumber());
        setNumber1(nextLotteryNumber());
        setNumber2(nextLotteryNumber());
        setNumber3(nextLotteryNumber());
        setNumber4(nextLotteryNumber());
        setPowerBall(generatePowerBallNumber());
    }

    /**
     * Returns a string of the form dd, dd, dd, dd, dd, Powerball dd.
     * 
     * @return string formatted powerball string
     */
    public String toString()
    {
        return String.format("%02d, %02d, %02d, %02d, %02d, Powerball %02d",
            getNumber0(),
            getNumber1(),
            getNumber2(),
            getNumber3(),
            getNumber4(),
            getPowerBall());
    }

    /**
     * Accessor for randomGenerator.
     * @return randomGenerator
     */
    public Random getRandomGenerator()
    {
        return randomGenerator;
    }

    /**
     * Mutator for randomGenerator.
     * @param newRandomGenerator newRandomGenerator
     */
    public void setRandomGenerator(Random newRandomGenerator)
    {
        randomGenerator = newRandomGenerator;
    }

    /**
     * Accessor for number0.
     * @return number0
     */
    public int getNumber0()
    {
        return number0;
    }

    /**
     * Mutator for number0.
     * @param newNumber0 newNumber0
     */
    public void setNumber0(int newNumber0)
    {
        number0 = newNumber0;
    }

    /**
     * Accessor for number1.
     * @return number1
     */
    public int getNumber1()
    {
        return number1;
    }
    
    /**
     * Mutator for number1.
     * @param newNumber1 newNumber1
     */
    public void setNumber1(int newNumber1)
    {
        number1 = newNumber1;
    }

    /**
     * Accessor for number2.
     * @return number2
     */
    public int getNumber2()
    {
        return number2;
    }

    /**
     * Mutator for number2.
     * @param newNumber2 newNumber2
     */
    public void setNumber2(int newNumber2)
    {
        number2 = newNumber2;
    }

    /**
     * Accessor for number3.
     * @return number3
     */
    public int getNumber3()
    {
        return number3;
    }

    /**
     * Mutator for number3.
     * @param newNumber3 newNumber3
     */
    public void setNumber3(int newNumber3)
    {
        number3 = newNumber3;
    }

    /**
     * Accessor for number4.
     * @return number4
     */
    public int getNumber4()
    {
        return number4;
    }

    /**
     * Mutator for number4.
     * @param newNumber4 newNumber4
     */
    public void setNumber4(int newNumber4)
    {
        number4 = newNumber4;
    }

    /**
     * Accessor for powerBall.
     * @return powerBall
     */
    public int getPowerBall()
    {
        return powerBall;
    }

    /**
     * Mutator for powerBall.
     * @param newPowerBall newPowerBall
     */
    public void setPowerBall(int newPowerBall)
    {
        powerBall = newPowerBall;
    }
}
