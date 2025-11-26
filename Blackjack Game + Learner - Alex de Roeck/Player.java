import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList; // For linked lists

public class Player extends Actor
{
    private int playerMoney;
    private boolean playerLost;
    private int currentHand;
    private LinkedList<Hand> handsList;
    private int lastHand;
    private boolean isTurn;
    //  Have a List for the hands.
    //  Will need to check if the list is empty.

    public void act()
    {
        // Add your action code here.
    }

    public Player (){
        this.playerMoney = 500;
        this.playerLost = false;
        this.currentHand = 0;
        this.handsList = new LinkedList<Hand>();
        this.lastHand = 0;
        this.isTurn = false;
    }

    
    public int getLastHand (){
        return(this.lastHand);
    }
    
    public void setLastHand (int value){
        this.lastHand = value;
    }
    
    
    public Boolean getPlayerTurn (){
        return(this.isTurn);
    }
    
    public void setPlayerTurn (Boolean value){
        this.isTurn = value;
    }
    
    
    public Hand getPlayerHand (int index){
        return (this.handsList.get(index));
    }
    
    public void addToHandList (Hand hand){
        this.handsList.add(hand);
    }

    
    public Hand getCurrentHand(){
        Hand currentH = handsList.get(this.currentHand); // Takes the first object
        // handsStack.remove(firstHand);
        return currentH;
    }

    public int getPlayerMoney(){
        return playerMoney;
    }
    
    public void stand(World world)
    {
        this.isTurn = false;
        //world.dealerTurn();
    }
}
