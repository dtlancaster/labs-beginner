/**
 * PatternsIntro class.
 * @author Dylan Lancaster
 * @version 11/27/2019
 */

public class PatternsIntro
{
    /**
     * No arg constructor.
     */
    public PatternsIntro()
    {
        tediousTenSquares();
        tenSquaresWhileLoop();
        tenSquaresForLoop();
        rowOfSquares(8, "black", 100, 300, 30, 20);
    }

    /**
     * Creates a row of 10 blue squares, each is 40x40 pixels, repeated every 50
     * pixels on the x-axis. The top-left corner of the row is at (x,y) =
     * (100,100)
     */
    public void tediousTenSquares() 
    {
        new Square(100, 100, 40, "blue");
        new Square(150, 100, 40, "blue");
        new Square(200, 100, 40, "blue");
        new Square(250, 100, 40, "blue");
        new Square(300, 100, 40, "blue");
        new Square(350, 100, 40, "blue");
        new Square(400, 100, 40, "blue");
        new Square(450, 100, 40, "blue");
        new Square(500, 100, 40, "blue");
        new Square(550, 100, 40, "blue");
    }

    /**
     * Create 10 squares with a while loop.
     */
    public void tenSquaresWhileLoop()
    {
        int i = 0;
        int startX = 100;
        int startY = 200;
        int size = 20;
        int spacing = 30;
        int interval = size + spacing;

        while (i < 10)
        {
            new Square(startX + interval * i, startY, size, "red");
            i++;
        }
    }

    /**
     * Create ten squares with a for loop.
     */
    public void tenSquaresForLoop() 
    {
        int interval = 20 + 30;

        for (int i = 0; i < 10; i++)
        {
            new Square((100 + interval * i), 250, 20, "green");
        }
    }

    /**
     * Create a row of squares with custom options.
     * @param numSquares amount of squares to add
     * @param color color of squares
     * @param x x position of top-left
     * @param y y position of top-left
     * @param size width/height of squares
     * @param spacing space between squares
     */
    public void rowOfSquares(int numSquares, String color,
        int x, int y, int size, int spacing)
    {
        int interval = size + spacing;

        for (int i = 0; i < numSquares; i++)
        {
            new Square((x + interval * i), y, size, color);
        }
    }
}
