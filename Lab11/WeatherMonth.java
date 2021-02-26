import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

/**
 * WeatherMonth.
 * 
 * @author Dylan Lancaster
 * @version 11/19/2019
 */
public class WeatherMonth
{
    private int[] maxTemperature;
    private String monthName;
    private int daysInMonth;
    private int[] minTemperature;

    /**
     * No-arg constructor for WeatherMonth.
     */
    public WeatherMonth()
    {
        setDaysInMonth(31);
        setMonthName("January");
    }

    /**
     * Arg constructor for WeatherMonth.
     * @param monthName monthName
     * @param daysInMonth daysInMonth
     */
    public WeatherMonth(String monthName, int daysInMonth)
    {
        setDaysInMonth(daysInMonth);
        setMonthName(monthName);
    }

    /**
     * main method.
     * @param args not used
     * @throws IOException IOException
     */
    public static void main(String[] args) throws IOException
    {
        WeatherMonth weatherMonth = new WeatherMonth("June", 33);
        weatherMonth.setDayMaxTemp(3, 85);
        weatherMonth.setDayMaxTemp(3, 85);
        weatherMonth.displayWeatherMonth();
    }

    /**
     * Accessor for maxTemperature.
     * @return maxTemperature
     */
    public int[] getMaxTemperature()
    {
        return this.maxTemperature;
    }

    /**
     * Mutator for maxTemperature.
     * @param maxTemperature maxTemperature
     */
    public void setMaxTemperature(int[] maxTemperature)
    {
        this.maxTemperature = maxTemperature;
        this.daysInMonth = maxTemperature.length;
    }

    /**
     * Mutator for maxTemperature[].
     * @param dayOfMonth dayOfMonth
     * @param temperature temperature
     */
    public void setDayMaxTemp(int dayOfMonth, int temperature)
    {
        System.out.println(dayOfMonth + ": " + temperature);

        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            this.maxTemperature[dayOfMonth - 1] = temperature;
        }
    }

    /**
     * Accessor for monthName.
     * @return monthName
     */
    public String getMonthName()
    {
        return this.monthName;
    }

    /**
     * Mutator for monthName.
     * @param monthName monthName
     */
    public void setMonthName(String monthName)
    {
        this.monthName = monthName == null ? "" : monthName;
    }

    /**
     * Accessor for daysInMonth.
     * @return daysInMonth
     */
    public int getDaysInMonth()
    {
        return this.daysInMonth;
    }

    /**
     * Mutator for daysInMonth.
     * @param daysInMonth daysInMonth
     */
    public void setDaysInMonth(int daysInMonth)
    {
        this.daysInMonth = daysInMonth;
        this.maxTemperature = new int[daysInMonth];
        this.minTemperature = new int[daysInMonth];
        
        Arrays.fill(this.maxTemperature, -999);
        Arrays.fill(this.minTemperature, -999);
    }

    /**
     * Accessor for minTemperature.
     * @return minTemperature
     */
    public int[] getMinTemperature()
    {
        return this.minTemperature;
    }

    /**
     * Mutator for minTemperature.
     * @param minTemperature minTemperature
     */
    public void setMinTemperature(int[] minTemperature)
    {
        this.minTemperature = minTemperature;
        this.daysInMonth = minTemperature.length;
    }
    
    /**
     * Set min temp for one day.
     * @param dayOfMonth dayOfMonth
     * @param temperature temperature
     */
    public void setDayMinTemp(int dayOfMonth, int temperature)
    {
        if (dayOfMonth >= 1 && dayOfMonth <= daysInMonth)
        {
            this.minTemperature[dayOfMonth - 1] = temperature;
        }
    }

    /**
     * Read min temp file.
     * @param filename filename
     * @throws IOException IOException
     */
    public void readMinTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        
        while (sc.hasNext())
        {
            int dayOfMonth = sc.nextInt();
            int temp = sc.nextInt();

            setDayMinTemp(dayOfMonth, temp);
        }

        sc.close();
    }

    /**
     * Display weather month.
     */
    public void displayWeatherMonth()
    {
        String result = getMonthName() + "\n";
        result += "Day\tMax\tMin\n";
        // result += "Day\tMax\tMin\n";
        
        for (int i = 0; i < daysInMonth; i++)
        {
            result += (i + 1) + "\t" + maxTemperature[i] + "\t"
                + minTemperature[i] + "\n";
        }

        System.out.print(result);
    }

    /**
     * Read max temp file.
     * @param filename filename
     * @throws IOException IOException
     */
    public void readMaxTempFile(String filename) throws IOException
    {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        
        while (sc.hasNext())
        {
            int dayOfMonth = sc.nextInt();
            int temp = sc.nextInt();

            setDayMaxTemp(dayOfMonth, temp);
        }

        sc.close();
    }

    /**
     * toString method.
     * @return string
     */
    public String toString()
    {
        String result = getMonthName() + "\n";
        result += String.format("%3s%9s%10s\n", "Day", "Max", "Min");
        // result += "Day\tMax\tMin\n";
        
        for (int i = 0; i < daysInMonth; i++)
        {
            String max = maxTemperature[i] == -999
                ? "N/A" : String.valueOf(maxTemperature[i]);
            String min = minTemperature[i] == -999
                ? "N/A" : String.valueOf(minTemperature[i]);
            result += String.format("%2d%10s%10s\n", (i + 1), max, min); 
            // result += (i + 1) + "\t" + max + "\t" + min + "\n";
        }

        return result;
    }
}
