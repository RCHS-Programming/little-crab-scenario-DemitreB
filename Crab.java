import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    
    /*
     * 
     */
    public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
    }
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
      if (isTouching(Worms.class))
        {
            removeTouching(Worms.class);
            Greenfoot.playSound("slurp.wav");
        }
    }
    
    /*
     * check whether a control key was pressed if so turn the crab
     */
    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            turn (-4);
        } 
        if (Greenfoot.isKeyDown("d"))
        {
            turn (4);
        } 
    }
    
    
}


