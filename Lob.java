import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lob here.
 * 
 * @author Demitre Beltran 
 * @version March 16 version 1
 */
public class Lob extends Actor
{
    public void act()
    {
        turnAtEdge();
            
        move();   
        
        lookForCrab();
        
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
    public void lookForCrab()
    {
        if (canSee(Crab.class))
        {
            eat(Crab.class);
            Greenfoot.stop();
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
    
    public void lokkForCrab()
    {
       
    }
}

   