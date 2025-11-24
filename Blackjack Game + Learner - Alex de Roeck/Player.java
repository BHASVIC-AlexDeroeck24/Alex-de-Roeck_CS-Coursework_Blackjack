import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList; // For linked lists

public class Player extends Actor
{
    private int playerMoney;
    private Boolean playerLost = false;
    private int currentHand;
    private LinkedList<Hand> handsList;
    //  Have a List for the hands.
    //  Will need to check if the list is empty.

    public void act()
    {
        // Add your action code here.
    }

    public Player (){
        this.playerMoney = 500;
        this.playerLost = false;
        this.currentHand = 1;
        this.handsList = new LinkedList<Hand>();
    }

    public void addToHandList (Hand hand){
        this.handsList.add(hand);
    }

    public Hand getCurrentHand(){
        Hand currentH = handsList.get(this.currentHand - 1); // Takes the first object
        // handsStack.remove(firstHand);
        return currentH;
    }

    public int getPlayerMoney(){
        return playerMoney;
    }
}
