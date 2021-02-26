import java.util.ArrayList;
import java.util.Arrays;
// import java.lang.Integer;

/**
 * CheckerBoard class.
 * @author Dylan Lancaster
 * @version 11/27/2019
 */
public class CheckerBoard
{
    private ArrayList<Row> rowList;

    /**
     * No arg constructor.
     */
    public CheckerBoard()
    {
        rowList = new ArrayList<Row>();

        for (int i = 0; i < 8; i++)
        {
            rowList.add(new Row(i));

            if ((i & 1) == 0)
            {
                // even
                rowList.get(i).changeEvenToBlack();
            }
            else
            {
                // odd
                rowList.get(i).changeOddToBlack();
            }
        }

        extraCreditAnimation();
    }

    /**
     * Nah.
     */
    public void reverseColors()
    {
        // Why would anyone want this
    }

    /**
     * Freeze program for x milliseconds.
     * @param waitAmountMillis amount of time to wait
     */
    public void delay(long waitAmountMillis)
    {
        long endTime = System.currentTimeMillis() + waitAmountMillis;

        while (System.currentTimeMillis() < endTime)
        {
            String checkStyle = "is absolute garbage";
        }
    }

    /**
     * Long complicated code that I didn't comment.
     * sorry about that
     * don't touch
     */
    public void extraCreditAnimation()
    {
        ArrayList<Integer> xList = new ArrayList<Integer>();
        ArrayList<Integer> yList = new ArrayList<Integer>();

        int[] series = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] seriesReverse = {7, 6, 5, 4, 3, 2, 1, 0};

        int delay = 15;

        delay(delay);

        for (int i = 0; i < 15; i++)
        {
            if (i <= 7)
            {
                int[] xIteration = Arrays.copyOfRange(seriesReverse, 7 - i, 8);
                int[] yIteration = Arrays.copyOfRange(series, 0, i + 1);

                for (int j = 0; j < xIteration.length; j++)
                {
                    xList.add(xIteration[j]);
                    yList.add(yIteration[j]);
                }
            }
            else
            {
                int[] xIteration = Arrays.copyOfRange(seriesReverse, 0, 15 - i);
                int[] yIteration = Arrays.copyOfRange(series, i - 7, 8);

                System.out.println(Arrays.toString(xIteration));
                System.out.println(Arrays.toString(yIteration));

                for (int j = 0; j < xIteration.length; j++)
                {
                    System.out.println(j);
                    xList.add(xIteration[j]);
                    yList.add(yIteration[j]);
                }
            }
        }

        for (int i = 0; i < xList.size(); i++)
        {
            delay(delay);
            setColor(xList.get(i), yList.get(i), "white");
        }

        int step = 1;
        int counter = 1;
        boolean flipped = false;
        boolean flipColor = false;

        for (int i = 0; i < xList.size(); i++)
        {
            if (!flipped)
            {
                if (step > 7)
                {
                    flipped = true;
                }
                if (counter == 0)
                {
                    flipColor = !flipColor;
                    step++;
                    counter = step;
                }
                counter--;
            }
            else
            {
                if (counter == 0)
                {
                    flipColor = !flipColor;
                    step--;
                    counter = step;
                }
                counter--;
            }

            delay += 1;
            delay(delay);
            setColor(xList.get(i), yList.get(i), flipColor ? "red" : "black");
        }
    }

    /**
     * Change color of a single square.
     * @param x x value of square
     * @param y y value of square
     * @param color color to change to
     */
    public void setColor(int x, int y, String color)
    {
        rowList.get(x).getSqList().get(y).setColor(color);
    }

    /**
     * Accessor for rowList.
     * @return rowList rowList
     */
    public ArrayList<Row> getRowList()
    {
        return this.rowList;
    }

    /**
     * Mutator for rowList.
     * @param rowList rowList
     */
    public void setRowList(ArrayList<Row> rowList)
    {
        this.rowList = rowList;
    }
}
