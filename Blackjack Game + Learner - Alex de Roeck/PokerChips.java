import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PokerChips extends Actor
{
    public void act()
    {
        // Add your action code here.
    }

    public void setChipSize(){
        GreenfootImage image = getImage();
        image.scale(60, 60);
        setImage(image);
    }
}
