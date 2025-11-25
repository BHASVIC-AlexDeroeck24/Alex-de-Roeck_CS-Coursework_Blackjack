import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For linked lists

public class Dealer extends Actor
{
    private Boolean dealerLost;
    private Boolean isTurn;
    private boolean handLost;
    private boolean blackjack;
    private ArrayList<Card> dealerHand;//  An ArrayList for the card objects in each hand.
    private int card1Value;
    private int card2Value;
    private int handTotal;
    
    public void act()
    {
        // Add your action code here.
    }
    
    public Dealer(){
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        
        Boolean dealerLost = false;
        Boolean isTurn;
        boolean handLost;
        boolean blackjack;
        
        Card card1 = deck.dealCard();
        this.dealerHand.add(card1);
        this.card1Value = card1.getCardValue();

        Card card2 = deck.dealCard();
        this.dealerHand.add(card2);
        this.card2Value = card2.getCardValue();

        this.handTotal = card1Value + card2Value;
    }
    
    public int getHandTotal (){
        return(this.handTotal);
    }
    
    public Boolean getDealerTurn (){
        return(this.isTurn);
    }
    
    public void setDealerTurn (Boolean value){
        this.isTurn = value;
    }
    
    public Boolean checkDealerLost(){
        return (this.handLost);
    }
    
    public void lost (){
        this.handLost = true;
        System.out.println("Player wins, the dealer went bust with a hand total of" + this.handTotal);
    }
    
    public void hit(){
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        
        Card newCard = deck.dealCard();
        this.dealerHand.add(newCard);
        this.handTotal = this.handTotal + newCard.getCardValue();
    }
    
    public void stand()
    {
       this.isTurn = false;
    }
}
