import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeckOfCards extends Actor
{
    int[] values = {1, 2, 3, 4, 5 ,6 ,7, 8, 9, 10, 11, 12, 13};
    String[] suits = {"S", "H", "C", "D"}; // Spades, Hearts, Clubs, Diamonds
    
    String[] playedCards = {}; //Played cards go here
    
    public void act()
    {
        // Add your action code here.
    }
    public void shuffle()
    {
        // Resets the deck, empties the 'played cards' array.
    }
    public void dealCard(){
        // Randomly select a card
    }
    private boolean checkCard(){
        // Check it is not in playedCards
    }
}
