import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class Player extends Actor
{
    int playerMoney;
    Boolean playerLost = false;
    private Hand currentHand;
    private ArrayList<Hand> handsStack;
    //  Have a Stack for the hands.
    //  This is so I can access the hands from first to last.
    //  In a first in last out order.
    //  Will need to check if the queue is empty.
    
    public void act()
    {
        // Add your action code here.
    }
    
    public Hand getCurrentHand(){
        handsStack.trimToSize(); // Removes any empty spaces in the queue
        Hand currentH = handsStack.get(0);
        // handsStack.remove(firstHand);
        return currentH;
    }
}
