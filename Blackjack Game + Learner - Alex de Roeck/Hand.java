import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists
import java.util.Collections;   // Used to randomise the order of data in an ArrayList

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
    ArrayList<Hand> handsQueue = new ArrayList<Hand>();

    //  Have a queue for the hands.
    //  This is so I can access the hands from first to last
    //  Will need to check if the queue is empty.

    public void act()
    {
        // Add your action code here.
    }

    public Hand (int NEWhandTotal, int NEWcard1Value, int NEWcard2Value){
        handTotal = NEWhandTotal;
        card1Value = NEWcard1Value;
        card2Value = NEWcard2Value;
    }

    public Hand getCurrentHand(){
        handsQueue.trimToSize(); // Removes any empty spaces in the queue
        Hand currentHand = handsQueue.get(0);
        // handsQueue.remove(firstHand);
        return currentHand;
    }
    
    public void createHand(int card1val, int card2val)
    {
        //Create a hand
        handsQueue.add(new Hand(card1val + card2val, card1val, card2val));
    }

    public void hit(Hand getCurrentHand)
    {
        //
        dealCard();
    }

    public void stand(Hand getCurrentHand)
    {
        //
    }

    public void split(Hand getCurrentHand)
    {
        //
    }

    public void doubleDown(Hand getCurrentHand)
    {
        //
    }

}
