import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ambulance extends Actor
{
    /**
     * Act - do whatever the ambulance wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor actor = getOneIntersectingObject (Banana.class);
        if (actor==null)
        { 
            setImage(new GreenfootImage("flower2.png"));
        }
    
    }
}
