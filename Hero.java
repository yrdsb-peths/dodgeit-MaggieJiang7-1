import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    boolean atTop = true;
    boolean keyLast = false;
    public void act()
    {   
        if (Greenfoot.mouseClicked(null) || Greenfoot.isKeyDown("space") && keyLast == false)
        {
            atTop = !atTop;
            keyLast = true;
        }
        
        if (atTop){
            setLocation(100,100);
        } else {
            setLocation (100, 300);
        }
    }
}
