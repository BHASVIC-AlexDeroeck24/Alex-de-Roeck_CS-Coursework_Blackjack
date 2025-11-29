import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ResetButton extends Button
{
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
        
        if(player.getPlayerTurn() == false && dealer.getDealerTurn() == false){
            player.addPlayerMoney(player.getTotalBet());
            player.emptyBet();
        }
    }

    public ResetButton ()
    {
        setMoveButtonSize();
    }
}
