import java.util.Scanner;

/**
 * Write a description of class Plotter here.
 * 
 * @author Dylan Lancaster
 * @version 10/29/2019
 */
public class Plotter
{
    /**
     * Main method.
     * @param args not used
     */
    public static void main(String[] args)
    {
        Plotter plotter = new Plotter();
        plotter.drawAxes();
        Scanner keyboard = new Scanner(System.in);
        plotter.plotPointsProper(keyboard);
    }

    /**
     * Draw x axis.
     */
    public void drawXAxis()
    {
        for (int x = 0; x < 300; x += 5)
        {
            new Square(x, 147);
        }
    }

    /**
     * Draw one x tick.
     * @param x x
     */
    public void drawOneXTick(int x)
    {
        for (int y = 137; y < 162; y += 5)
        {
            new Square(x, y);
        }
    }

    /**
     * Draw all x ticks.
     */
    public void drawAllXTicks()
    {
        for (int x = 7; x < 300; x += 20)
        {
            drawOneXTick(x);
        }
    }

    /**
     * Draw y axis.
     */
    public void drawYAxis()
    {
        for (int y = 0; y < 300; y += 5)
        {
            new Square(147, y);
        }
    }

    /**
     * Draw one y tick.
     * @param y y
     */
    public void drawOneYTick(int y)
    {
        for (int x = 137; x < 162; x += 5)
        {
            new Square(x, y);
        }
    }

    /**
     * Draw all y ticks.
     */
    public void drawAllYTicks()
    {
        for (int y = 7; y < 300; y += 20)
        {
            drawOneYTick(y);
        }
    }

    /**
     * Draw axds.
     */
    public void drawAxes()
    {
        drawXAxis();
        drawYAxis();
        drawAllXTicks();
        drawAllYTicks();
    }

    /**
     * Plot points.
     * @param keyboard a scanner instance
     */
    public void plotPoints(Scanner keyboard)
    {
        String message = "Enter an x and y coordinate: ";
        int x = 0;
        int y = 0;

        System.out.print(message);

        while (keyboard.hasNext())
        {
            System.out.print(message);
            x = keyboard.nextInt();

            if (x > 290 || x < 0)
            {
                System.out.println("Done");
                break;
            }

            y = keyboard.nextInt();

            if (y > 290 || y < 0)
            {
                System.out.println("Done");
                break;
            }

            new Circle(x, y);
        }
    }

    /**
     * Plot points proper.
     * @param keyboard a scanner instance
     */
    public void plotPointsProper(Scanner keyboard)
    {
        String message = "Enter an x and y coordinate: ";
        int x = 0;
        int y = 0;

        System.out.print(message);

        while (keyboard.hasNext())
        {
            System.out.print(message);
            x = keyboard.nextInt();

            if (x > 145 || x < -145)
            {
                System.out.println("Done");
                break;
            }

            y = keyboard.nextInt();

            if (y > 145 || y < -145)
            {
                System.out.println("Done");
                break;
            }

            new Circle(translateXPoint(x), translateYPoint(y));
        }
    }
    
    /**
     * Convert cartesian coordinate to x position.
     * @param x original point
     * @return x translated point
     */
    private int translateXPoint(int x)
    {
        return x + 144;
    }

    /**
     * Convert cartesian coordinate to y position.
     * @param y original point
     * @return y translated point
     */
    private int translateYPoint(int y)
    {
        return (y * -1) + 144;
    }
}
