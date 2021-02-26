
/**
 * Write a description of class Scene here.
 * 
 * @author Dylan Lancaster
 * @version 10/02/2019
 */
public class Scene
{
    private House house1;
    private House house2;
    private Circle sun;
    private Circle moon;
    
    /**
     * Constructor for Scene.
     */
    public Scene()
    {
        house1 = new House();
        house1.moveHorizontal(-70);
        house1.moveVertical(-10);
        house1.changeWallColor("red");
        house1.changeWindowColor("blue");
        house1.changeRoofColor("green");
       
        house2 = new House();
        house2.moveHorizontal(70);
        house2.moveVertical(-30);
        house2.changeWallColor("blue");
        house2.changeWindowColor("yellow");
        house2.changeRoofColor("black");
       
        sun = new Circle();
        sun.changeColor("yellow");
        sun.changeSize(50);
        sun.moveVertical(-40);
       
        moon = new Circle();
        moon.changeColor("blue");
        moon.changeSize(50);
        moon.moveVertical(-40);
        moon.moveHorizontal(-100);
       
        sun.makeVisible();
        moon.makeVisible();
    }
    
    /**
     * main method.
     * 
     * @param args not used
     */
    public static void main(String[] args)
    {
        Scene scene = new Scene();
        
        scene.animate();
    }
    
    /**
     * Animate the scene.
     */
    public void animate()
    {
        sun.slowMoveHorizontal(300);
        moon.slowMoveHorizontal(300);
    }
}
