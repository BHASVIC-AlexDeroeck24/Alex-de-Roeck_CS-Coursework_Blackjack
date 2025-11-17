import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class Hand extends Actor
{
    private int handTotal;
    private int card1Value;
    private int card2Value;
    private boolean handLost;
    private ArrayList<Card> cardsInHand;

    //  An ArrayList for the card objects in each hand.

    public void act()
    {
        // Add your action code here.
    }

    public Hand (){
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        
        this.cardsInHand = new ArrayList<Card>();
        
        Card card1 = deck.dealCard();
        this.cardsInHand.add(card1);
        this.card1Value = card1.getCardValue();
        
        Card card2 = deck.dealCard();
        this.cardsInHand.add(card2);
        this.card2Value = card2.getCardValue();
        
        this.handTotal = card1Value + card2Value;
    }

    public void hit(Hand getCurrentHand)
    {
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();
        
        Card newCard = deck.dealCard();
        this.cardsInHand.add(newCard);
        this.handTotal = newCard.getCardValue();
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
