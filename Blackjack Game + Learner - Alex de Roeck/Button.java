import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    public void act()
    {
        // Add your action code here.
    }
    
    public void setMoveButtonSize(){
        GreenfootImage image = getImage();
        image.scale(120, 50);
        setImage(image);
    }
    
    public void setMoneyBoxSize(){
        GreenfootImage image = getImage();
        image.scale(265, 50);
        setImage(image);
    }
}
