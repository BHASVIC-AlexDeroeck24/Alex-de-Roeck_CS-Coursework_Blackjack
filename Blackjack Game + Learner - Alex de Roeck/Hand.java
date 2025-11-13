import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class Hand extends Actor
{
    private int handTotal;
    private int card1Value;
    private int card2Value;
    private int currentHand;
    private boolean handLost;
    private ArrayList<Hand> handsStack;

    //  Have a Stack for the hands.
    //  This is so I can access the hands from first to last
    //  In a first in last out order.
    //  Will need to check if the queue is empty.

    public void act()
    {
        // Add your action code here.
    }

    public Hand (){
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        
        this.handsQueue = new ArrayList<Hand>();
        
        Card card1 = deck.dealCard();
        this.card1Value = card1.getCardValue();
        
        Card card2 = deck.dealCard();
        this.card2Value = card2.getCardValue();
        
        handsQueue.add(this);
        
        handTotal = card1Value + card2Value;
    }

    public Hand getCurrentHand(){
        handsQueue.trimToSize(); // Removes any empty spaces in the queue
        Hand currentHand = handsQueue.get(0);
        // handsQueue.remove(firstHand);
        return currentHand;
    }

    public void hit(Hand getCurrentHand)
    {
        //
        
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
