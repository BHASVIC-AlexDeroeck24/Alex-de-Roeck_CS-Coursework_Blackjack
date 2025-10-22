import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand extends Actor
{
    int handTotal = 0;
    int card1Value = 0;
    int card2Value = 0;
    int currentHand = 1;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void createHand()
    {
        //Create a hand, ArrayList to store all card objects in the hand
        ArrayList<Card> cardsInHand = new ArrayList<Card>();
    }
    
    public void hit(currentHand)
    {
        //
        dealCard();
        
    }
    
    public void stand(currentHand)
    {
        //
    }
    
    public void split(currentHand)
    {
        //
    }
    
    public void doubleDown(currentHand)
    {
        //
    }
    
    
}
