import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StandButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StandButton extends Button
{
    /**
     * Act - do whatever the StandButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
