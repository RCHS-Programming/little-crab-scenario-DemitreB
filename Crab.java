import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int wormsEaten;
    
    /*
     * 
     */
    public Crab()
    {
        image1 = new GreenfootImage ("crab.png");
        image2 = new GreenfootImage ("crab2.png");
        setImage (image1);
        wormsEaten = 0;
    }
    public void act()
    {
       
        checkKeyPress();
        
        move();   
        
        lookForWorms();
        
        switchImage();
        
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
            wormsEaten = wormsEaten + 1;
            
            getWorld().showText ("Score = " + wormsEaten, 50, 550);
            if (wormsEaten == 10)
            {
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
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
    
    /*
     * change image of crab to make animated
     */
    public void switchImage()
    {
         if (getImage()== image1)
        {
            setImage (image2);
        }
        else
        {
            setImage (image1);
        }
    }
}


