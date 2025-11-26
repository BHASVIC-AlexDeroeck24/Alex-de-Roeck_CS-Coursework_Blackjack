import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For Array lists

public class Dealer extends Actor
{
    private boolean dealerLost;
    private boolean isTurn;
    private boolean handLost;
    private boolean blackjack;
    private ArrayList<Card> dealerHand;//  An ArrayList for the card objects in each hand.
    private int card1Value;
    private int card2Value;
    private int handTotal;
    private int lastPos;

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

    public Dealer (){
        this.dealerLost = false;
        this.isTurn = false;
        this.handLost = false;
        this.blackjack = false;
        this.lastPos = 625;
        this.dealerHand = new ArrayList<Card>();
    }

    public void startDealer(World world){
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();

        Card card1 = deck.dealCard();
        this.dealerHand.add(card1);
        this.card1Value = card1.getCardValue();
        mainGame.addObject(card1, 710, 120);

        Card card2 = deck.dealCard();
        card2.faceDown();
        this.dealerHand.add(card2);
        this.card2Value = card2.getCardValue();
        mainGame.addObject(card2, 625, 120);

        this.handTotal = card1Value + card2Value;
    }

    public void dealerTurn(World world){
        MainGame mainGame = (MainGame)world;
        Player player = mainGame.getPlayer();
        revealCard();
        while (getHandTotal() < 17){
            hit(mainGame);
        }
        if (getHandTotal() > 21){
            lost();
        }
        else{
            stand();
            for (int i = 0; i <= player.getLastHand(); i++){

                //  IF THE PLAYER'S HAND HAS ALREADY GONE BUST (DEALER HAND WINS)
                if ( player.getPlayerHand(i).getHandLost() == true ){
                    System.out.println("Player's hand " + (i + 1) + " has lost, it went bust.");
                }

                //  IF THE PLAYER'S HAND TOTAL IS LESS THAN DEALER'S (DEALER HAND WINS)
                if ( player.getPlayerHand(i).getHandTotal() < getHandTotal() ){
                    player.getPlayerHand(i).setHandLost(true);
                    System.out.println("Player's hand " + (i + 1) + " has lost, the dealer beat it.");
                }

                //  IF THE PLAYER'S HAND TOTAL IS MORE THAN DEALER'S (PLAYER HAND WINS)
                if ( player.getPlayerHand(i).getHandTotal() < getHandTotal() ){
                    player.getPlayerHand(i).setHandLost(true);
                    System.out.println("Player's hand " + (i + 1) + " has won, the dealer hand had less.");
                }

                if ( player.getPlayerHand(i).getHandTotal() == getHandTotal() ){
                    System.out.println("Player's hand " + (i + 1) + " is equal to the dealer's hand.");
                }
                
                if ( player.getPlayerHand(i).getBlackjack()){
                    System.out.println("BLACKJACK!! The Player's hand " + (i + 1) + " has won. Dealer had " + getHandTotal());
                }
            }
        }
    }

    public int getHandTotal (){
        return(this.handTotal);
    }

    public boolean getDealerTurn (){
        return(this.isTurn);
    }

    public void revealCard (){
        this.dealerHand.get(1).faceUp();
    }

    public void setDealerTurn (Boolean value){
        this.isTurn = value;
    }

    public boolean checkDealerLost(){
        return (this.handLost);
    }

    public void lost (){
        this.handLost = true;
        System.out.println("Player wins, the dealer went bust with a hand total of: " + this.handTotal);
    }

    public void hit(World world){
        MainGame mainGame = (MainGame)world;
        DeckOfCards deck = mainGame.getDeck();

        Card newCard = deck.dealCard();
        this.dealerHand.add(newCard);
        this.handTotal = this.handTotal + newCard.getCardValue();
        mainGame.addObject(newCard, this.lastPos - 85, 120);
        lastPos = lastPos - 85;
    }

    public void stand()
    {
        this.isTurn = false;
    }
}
