import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FastFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastFish extends Actor
{
    /**
     * Act - do whatever the FastFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        if (isAtEdge()) {
            turn(28);
        }
    }
}
