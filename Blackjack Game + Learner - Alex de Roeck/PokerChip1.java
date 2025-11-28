import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PokerChip1 extends PokerChips
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
        
        if (player.getPlayerMoney() >= this.myValue){
            player.subPlayerMoney(this.myValue);
            player.addToTotalBet(this.myValue);
            System.out.println("Updated Player Money and Total Bet");
        }
        else{
            System.out.println("Insufficient Funds");
        }
    }
    
    public PokerChip1 ()
    {
        this.myValue = 1;
        setChipSize();
    }
}
