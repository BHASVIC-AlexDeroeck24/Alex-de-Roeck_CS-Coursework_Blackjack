import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HitButton extends Button
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
        
        if (hand.getHandTotal() < 21 && (player.getPlayerTurn() == true)){      
            hand.hit(world);
        }
    }
    
    public HitButton (){
        setMoveButtonSize();
    }
}
