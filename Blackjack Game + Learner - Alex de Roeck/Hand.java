import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class Hand extends Actor
{
    private boolean handLost;
    private ArrayList<Card> cardsInHand;
    private int card1Value;
    private int card2Value;
    private int handTotal;

    //  An ArrayList for the card objects in each hand.

    public void act()
    {
        // Add your action code here.
        if (handTotal = 21 && card1Value != 11 || card2Value != 11):
    }

    //FOR FIRST HAND --------------------------------------------------------------
    public Hand (){
        this.handLost = false;

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
    public Hand (Card cardOne){
        this.handLost = false;

        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        Player player = mainGame.getPlayer();

        player.addToHandList(this);

        this.cardsInHand = new ArrayList<Card>();

        Card card1 = cardOne;
        this.cardsInHand.add(card1);
        this.card1Value = card1.getCardValue();

        Card card2 = deck.dealCard();
        this.cardsInHand.add(card2);
        this.card2Value = card2.getCardValue();

        this.handTotal = card1Value + card2Value;
    }   //polymorhphism for splitting

    public void hit()
    {
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        
        Card newCard = deck.dealCard();
        this.cardsInHand.add(newCard);
        this.handTotal = newCard.getCardValue();
    }

    public void stand()
    {
        //
    }

    public void split()
    {
        //
    }

    public void doubleDown()
    {
        //
    }
}
