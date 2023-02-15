import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    private int offsetX = 5;
    private int offsetY = 5;
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX, y + offsetY);
        
        if(getY() >= 380 || getY() <= 0){
            offsetY *= -1;
        }
        
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
    }
}
