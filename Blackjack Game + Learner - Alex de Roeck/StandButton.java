import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class StandButton extends Button
{
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            this.pressed();
        }
    }
    
    public void pressed(){
        World world = getWorld();
        MainGame mainGame = (MainGame)world;
        Player player = mainGame.getPlayer();
        Dealer dealer = mainGame.getDealer();
        
        Hand hand = player.getPlayerHand(player.getCurrentHand());
        
        hand.stand(world);
        
        
    }
    
    public StandButton (){
        setMoveButtonSize();
    }
}
