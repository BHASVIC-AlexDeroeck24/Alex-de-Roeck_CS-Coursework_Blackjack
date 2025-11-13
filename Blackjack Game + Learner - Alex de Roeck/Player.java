import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int playerMoney;
    Boolean playerLost = false;
    private ArrayList<Hand> handsStack;
    //  Have a Stack for the hands.
    //  This is so I can access the hands from first to last.
    //  In a first in last out order.
    //  Will need to check if the queue is empty.
    
    public void act()
    {
        // Add your action code here.
    }
    
}
