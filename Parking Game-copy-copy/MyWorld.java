import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ambulance ambulance = new ambulance();
        addObject(ambulance,282,181);
        
        Banana banana = new Banana();
        addObject(banana,282,185);
        
        Fish fish = new Fish();
        addObject(fish,37,339);
        Fish fish2 = new Fish();
        addObject(fish2,44,190);
        Fish fish3 = new Fish();
        addObject(fish3,37,60);
        banana.setLocation(282,181);
    
    }
}
