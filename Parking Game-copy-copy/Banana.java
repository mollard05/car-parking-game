import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
    }
    private void movement()
    {   
    
        if (Greenfoot.isKeyDown("w"))
        {
            move(4);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-3);
        }
        if (Greenfoot.isKeyDown("a")&&Greenfoot.isKeyDown("w"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("a")&&Greenfoot.isKeyDown("s"))
        {
            turn(2);
        }
        if (Greenfoot.isKeyDown("d")&&Greenfoot.isKeyDown("w"))
        {
            turn(3);
        }
        if (Greenfoot.isKeyDown("d")&&Greenfoot.isKeyDown("s"))
        {
            turn(-2);
        }
    }
    public void HitFish()
    {
        Actor actor = getOneIntersectingObject (Fish.class);
        if (actor!= null && getNeighbours(getImage().getWidth()/2,false,Rock.class).contains(rock) && rock.hitsShip(this))
        {
            Greenfoot.stop();
        }
    }
    public boolean hitsShip()
    
    {
        return getObjectsInRange(getImage().getWidth()/2,Fish.class
    }
}
