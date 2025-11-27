import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TotalValueCounter extends Actor
{
    private Hand handCounted;
    private Dealer dealerCounted;
    private int handTotal;
    private boolean isDealer;

    public void act()
    {
        if (this.isDealer){
            this.handTotal = dealerCounted.getHandTotal();
            setImage(new GreenfootImage("Hand Total: " + handTotal, 20, Color.BLACK, new Color(0, 0, 0, 0)));
        }
        else{
            this.handTotal = handCounted.getHandTotal();
            setImage(new GreenfootImage("Hand Total: " + handTotal, 20, Color.BLACK, new Color(0, 0, 0, 0)));
        }
    }

    public TotalValueCounter (Hand hand)
    {
        this.isDealer = false;
        this.handCounted = hand;
        this.handTotal = handCounted.getHandTotal();

        setImage(new GreenfootImage("Hand Total: " + handTotal, 20, Color.BLACK, new Color(0, 0, 0, 0)));
    }

    public TotalValueCounter (Dealer dealer)
    {
        this.isDealer = true;
        this.dealerCounted = dealer;
        this.handTotal = dealerCounted.getHandTotal();

        setImage(new GreenfootImage("Hand Total: " + handTotal, 20, Color.BLACK, new Color(0, 0, 0, 0)));
    }
}
