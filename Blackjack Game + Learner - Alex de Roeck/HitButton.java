import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class HitButton extends Button
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
        
        Hand hand = player.getCurrentHand();
        
        hand.hit(world);
    }
    
    public HitButton (){
        setMoveButtonSize();
    }
    
    
}
