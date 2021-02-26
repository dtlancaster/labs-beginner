
/**
 * Write a description of class House here.
 * 
 * @author Dylan Lancaster
 * @version 10/02/2019
 */
public class House
{
    private Square wall;
    private Triangle roof;
    private Square window;
    
    /**
     * House constructor.
     */
    public House()
    {
        wall = new Square();
        wall.changeSize(100);
        wall.moveVertical(150);
        wall.moveHorizontal(40);
        wall.makeVisible();
        
        roof = new Triangle();
        roof.changeColor("black");
        roof.changeSize(50, 140);
        roof.moveVertical(135);
        roof.moveHorizontal(100);
        roof.makeVisible();
        
        window = new Square();
        window.changeColor("blue");
        window.moveVertical(170);
        window.moveHorizontal(50);
        window.makeVisible();
    }
    
    /**
     * main method.
     * 
     * @param args not used
     */
    public static void main(String[] args)
    {
        House house = new House();
    }
    
    /**
     * Change roof color.
     * 
     * @param newColor new color to use
     */
    public void changeRoofColor(String newColor)
    {
        roof.changeColor(newColor);
    }
    
    /**
     * Change wall color.
     * 
     * @param newColor new color to use
     */
    public void changeWallColor(String newColor)
    {
        wall.changeColor(newColor);
    }
    
    /**
     * Change window color.
     * 
     * @param newColor new color to use
     */
    public void changeWindowColor(String newColor)
    {
        window.changeColor(newColor);
    }
    
    /**
     * Move entire house horizontally.
     * 
     * @param x amount to move
     */
    public void moveHorizontal(int x)
    {
        wall.moveHorizontal(x);
        roof.moveHorizontal(x);
        window.moveHorizontal(x);
    }
    
    /**
     * Move entire house vertically.
     * 
     * @param y amount to move
     */
    public void moveVertical(int y)
    {
        wall.moveVertical(y);
        roof.moveVertical(y);
        window.moveVertical(y);
    }
    
    /**
     * Make the house invisible.
     */
    public void makeInvisible()
    {
        wall.makeInvisible();
        roof.makeInvisible();
        window.makeInvisible();
    }
    
    /**
     * Make the house visible.
     */
    public void makeVisible()
    {
        wall.makeVisible();
        roof.makeVisible();
        window.makeVisible();
    }
}
