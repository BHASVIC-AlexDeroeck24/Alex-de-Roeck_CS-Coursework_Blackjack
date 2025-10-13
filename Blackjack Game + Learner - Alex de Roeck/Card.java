import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    int valueOfCard = 0;
    String cardValue;
    String cardSuit;

    public void act()
    {
        // Add your action code here.
    }

    public Card (int cardValue, int valueOfCard, String cardSuit, String cardIs){
        //

        
    }
    
    //UNUSED CODE BELOW ---------------------------------------------------------------------------------------------------------------
    
    public void UNUSED_CODE1 (int cardVal, String cardSu, String cardIs){
        cardSuit = cardSu; //String of Card Suit

        if (cardVal < 10){
            cardValue = String.valueOf(cardVal+1);
        }
        else{
            switch (cardVal){
                case 10:
                    cardValue = "J";
                    break;
                case 11:
                    cardValue = "Q";
                    break;
                case 12:
                    cardValue = "K";
                    break;
            } //Converts >10 valued cards to court cards
        } //Converts cardVal into the value of the card

        if (cardVal > 10){
            valueOfCard = 10;
        } //Sets valueOfCard to the value in Blackjack it has

    }
}
