import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class TotalValueCounter extends Actor
{
    private Hand handCounted;
    private Dealer dealerCounted;
    private Player playerCounted;
    private World worldCounted;
    private int handTotal;
    private int totalValue;
    private boolean isDealer = false;
    private boolean isPlayerMoney = false;
    private boolean isTotalBet = false;

    public void act()
    {
        if (this.isPlayerMoney){
            this.totalValue = playerCounted.getPlayerMoney();
            setImage(new GreenfootImage("Total Money: " + totalValue, 35, Color.BLACK, new Color(0, 0, 0, 0)));
        }
        else if (this.isTotalBet){
            this.handTotal = playerCounted.getTotalBet();
            setImage(new GreenfootImage("Total Bet: " + handTotal, 20, Color.YELLOW, new Color(0, 0, 0, 0)));
        }
        else if (this.isDealer){
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
    
    public TotalValueCounter (Player player)
    {
        this.isPlayerMoney = true;
        this.playerCounted = player;
        this.totalValue = player.getPlayerMoney();

        setImage(new GreenfootImage("Total Money: " + totalValue, 35, Color.BLACK, new Color(0, 0, 0, 0)));
    }
    
    public TotalValueCounter (Player player, boolean value)
    {
        this.isTotalBet = value;
        this.playerCounted = player;
        this.totalValue = playerCounted.getTotalBet();
        
        setImage(new GreenfootImage("Total Bet: " + totalValue, 20, Color.YELLOW, new Color(0, 0, 0, 0)));
    }
}
