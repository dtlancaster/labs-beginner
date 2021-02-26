import java.util.ArrayList;

/**
 * Row class.
 * @author Dylan Lancaster
 * @version 11/27/2019
 */

public class Row
{
    private ArrayList<Square> sqList;

    /**
     * No arg constructor.
     */
    public Row()
    {
        setSqList(new ArrayList<Square>());
        delay(400);

        addSquaresToList();
        delay(400);

        changeSquareSize(48);
        delay(400);

        changeEvenToBlack();
        delay(400);
    }

    /**
     * Arg constructor.
     * @param rowNumber rowNumber
     */
    public Row(int rowNumber)
    {
        setSqList(new ArrayList<Square>());
        addSquaresToList();
        changeSquareSize(48);
        moveVertically(rowNumber * 50);
    }

    /**
     * Add 8 squares to list.
     */
    public void addSquaresToList()
    {
        int i = 0;
        int size = 50;
        int spacing = 0;
        int interval = size + spacing;

        while (i < 8)
        {
            sqList.add(new Square(interval * i, 0, size, "red"));
            i++;
        }
    }

    /**
     * Move squares vertically.
     * @param amountToMove distance to move row
     */
    public void moveVertically(int amountToMove)
    {
        for (Square square : sqList)
        {
            square.setY(square.getY() + amountToMove);
        }
    }

    /**
     * Change square size.
     * @param size new size of squares
     */
    public void changeSquareSize(int size)
    {
        for (Square square : sqList)
        {
            square.setSize(size);
        }
    }

    /**
     * Set even squares to black color.
     */
    public void changeEvenToBlack()
    {
        for (int i = 0; i < sqList.size(); i += 2)
        {
            sqList.get(i).setColor("black");
        }
    }

    /**
     * Set odd squares to black color.
     */
    public void changeOddToBlack()
    {
        for (int i = 1; i < sqList.size(); i += 2)
        {
            sqList.get(i).setColor("black");
        }
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
     * Accessor for sqList.
     * @return sqList sqList
     */
    public ArrayList<Square> getSqList()
    {
        return this.sqList;
    }

    /**
     * Mutator for sqList.
     * @param sqList sqList
     */
    public void setSqList(ArrayList<Square> sqList)
    {
        this.sqList = sqList;
    }
}
