import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private int delay = 0;
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movement();
        
        int xcoord=getX();
        int ycoord=getY();
        if (xcoord==0)
        {
            World MyWorld = getWorld();
            setLocation(1080,ycoord);
        }
    }
    private void movement()
    {
            move(-4);
    }
    private void boundaries()
    {
        int random = Greenfoot.getRandomNumber(10000);
        int ycoord2=getY();
        if (random<10+10)
        {
            World MyWorld = getWorld();
            MyWorld.addObject(new Fish(),1080,ycoord2);
             delay = 50;
        }
    }
}
