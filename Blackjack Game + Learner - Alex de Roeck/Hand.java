import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class Hand extends Actor
{
    private boolean handLost;
    private boolean blackjack;
    private ArrayList<Card> cardsInHand;//  An ArrayList for the card objects in each hand.
    private int card1Value;
    private int card2Value;
    private int handTotal;

    public void act()
    {
        // Add your action code here.
        if (handTotal > 21){
            this.handLost = true;
        }
        
        if (handTotal == 21){
            this.blackjack = true;
        }
        else{
            this.blackjack = false;
        }
    }

    //FOR FIRST HAND --------------------------------------------------------------
    public Hand (){
        this.handLost = false;
        this.blackjack = false;
        
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        player.addToHandList(this);

        this.cardsInHand = new ArrayList<Card>();

        Card card1 = deck.dealCard();
        this.cardsInHand.add(card1);
        this.card1Value = card1.getCardValue();

        Card card2 = deck.dealCard();
        this.cardsInHand.add(card2);
        this.card2Value = card2.getCardValue();

        this.handTotal = card1Value + card2Value;
    }

    //FOR SPLITTING ---------------------------------------------------------------
    public Hand (Card cardTwo){
        this.handLost = false;
        this.blackjack = false;

        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        player.addToHandList(this);

        this.cardsInHand = new ArrayList<Card>();

        Card card1 = cardTwo;
        this.cardsInHand.add(card1);
        this.card1Value = card1.getCardValue();

        Card card2 = deck.dealCard();
        this.cardsInHand.add(card2);
        this.card2Value = card2.getCardValue();

        this.handTotal = card1Value + card2Value;
    }   //polymorhphism for splitting

    
    public int getHandTotal(){
        return (this.handTotal);
    }
    
    
    public Boolean getHandLost(){
        return (this.handLost);
    }
    
    public void setHandLost(Boolean value){
        this.handLost = value;
    }
    
    
    public void hit()
    {
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();
        
        if (handTotal <= 21 && (player.getPlayerTurn() == true)){           
            Card newCard = deck.dealCard();
            this.cardsInHand.add(newCard);
            this.handTotal = this.handTotal + newCard.getCardValue();
        }
    }

    public void stand()
    {
        //
    }

    public void split()
    {
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();
        
        if (card1Value == card2Value && (player.getPlayerTurn() == true)){
            
        }
    }

    public void doubleDown()
    {
        //
    }
}
