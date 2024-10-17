import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shark extends Actor
{
    /**
     * Act - do whatever the Shark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String name;
    private int size;
    
    public Shark(String sharkName, int sharkSize)
    {
        name = sharkName;
        size = sharkSize;
        //modify image size based on given parameters
        getImage().scale(15*size, 10*size); 

        //change text color and write the name as text on the image
        getImage().setColor(Color.BLUE);
        getImage().drawString(name, 5*size, 5*size);
    }
    
    public void act()
    {
        // Add your action code here.
    }
}
