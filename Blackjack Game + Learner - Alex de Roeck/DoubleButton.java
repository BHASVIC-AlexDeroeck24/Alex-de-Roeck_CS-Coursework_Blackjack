import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoubleButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleButton extends Button
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            this.pressed();
        }
    }

    public void pressed(){
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        Player player = mainGame.getPlayer();

        Hand hand = player.getPlayerHand(player.getCurrentHand());
        
        if ( hand.getHandTotal() < 21 && (player.getPlayerTurn() == true)
        && player.getPlayerMoney() > player.getTotalBet() ){
            player.subPlayerMoney(player.getTotalBet());
            player.addToTotalBet(player.getTotalBet());
            System.out.println("Updated Player Money and Total Bet");
            hand.doubleDown(world);
        }
    }

    public DoubleButton (){
        setMoveButtonSize();
    }
}
