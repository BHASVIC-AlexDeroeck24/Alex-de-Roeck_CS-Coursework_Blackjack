import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PokerChip10 extends PokerChips
{
    private int myValue;
    
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            this.pressed();
        }
    }
    
    public void pressed()
    {
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        Player player = mainGame.getPlayer();
        Dealer dealer = mainGame.getDealer();
        
        if (player.getPlayerMoney() >= this.myValue && (player.getPlayerTurn() == false) && (dealer.getDealerTurn() == false) ){
            player.subPlayerMoney(this.myValue);
            player.addToTotalBet(this.myValue);
            System.out.println("Updated Player Money and Total Bet");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    
    public PokerChip10 ()
    {
        this.myValue = 10;
        setChipSize();
    }
}
