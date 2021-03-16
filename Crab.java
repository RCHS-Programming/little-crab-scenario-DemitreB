import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
        turnAtEdge();
            
        move();   
        
        lookForWorms();
        
        randomTurn();
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
        if(isTouching(Worms.class))
        {
            removeTouching(Worms.class);
        }
    }

    /*
     * make the crab turn randomly left or right
     * between 0 and 40 degrees 
     */
    public void randomTurn()
    {
       if(Greenfoot.getRandomNumber(100)<10)
            {
                turn (Greenfoot.getRandomNumber(91) -45);
            } 
    }
    
    public void turnAtEdge()
    {
        if ( isAtEdge ())
            {
                turn(17);
            }
    }
}


