import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave extends Actor
{
    /**
     * Act - do whatever the Nave wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if(Greenfoot.isKeyDown("Left")){
            turn(-3);
        }
        if(Greenfoot.isKeyDown("Right")){
            turn(3);
        }
        
    }
    
}
