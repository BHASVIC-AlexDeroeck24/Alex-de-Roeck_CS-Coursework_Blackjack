import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class DealButton extends Button
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
            if(player.getTotalBet() == 0){
                System.out.println();
                System.out.println("--- PLEASE BET BEFORE ATTEMPTING TO START GAME ---");
                System.out.println();
            }
            else{
                mainGame.gameStart();
                player.setPlayerTurn(true);
            }
        }
    }

    public DealButton ()
    {
        setMoveButtonSize();
    }
}
