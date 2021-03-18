import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        checkKeyPress();
        
        move();   
        
        lookForWorms();
        
    }
    
    public void move( )
    {
      move(5);
    }
    
    /*
     * check whether we have stubled over a worm
     * if we have eat it, do nohing
     */
    public void lookForWorms()
    {
      if (canSee(Crab.class))
        {
            eat(Crab.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /*
     * check whether a control key was pressed if so turn the crab
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn (-4);
        } 
        if (Greenfoot.isKeyDown("right"))
        {
            turn (4);
        } 
    }
    
    
}


