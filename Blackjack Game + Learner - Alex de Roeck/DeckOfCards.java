import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists

public class DeckOfCards extends Actor
{
    ArrayList<String> playedCards = new ArrayList<String>(); //Played cards go here

    public void act()
    {
        // Add your action code here.
    }

    public void shuffleDeck()
    {
        // Resets the deck, empties the 'played cards' array.
        playedCards.clear();
    }

    public void dealCard(){
        // Randomly select a card
        String cardSuit = "N";
        int rand1 = -1;
        int rand2 = -1;
        
        // Might need to check if there are cards left in the deck later on **************************
        while (checkCardUsed(rand1, rand2) == true){
            rand1 = Greenfoot.getRandomNumber(13); // (0 <= x < 13), one more than array because array starts at 0
            rand2 = Greenfoot.getRandomNumber(4);
        }
        
        switch (rand2){ 
            case 0:
                cardSuit = "S";
                break;
            case 1:
                cardSuit = "H";
                break;
            case 2:
                cardSuit = "C";
                break;
            case 3:
                cardSuit = "D";
                break;
        } // Sets cardSuit to the card's suit
        
        String cardIs = String.valueOf(rand1) + cardSuit;
        playedCards.add(cardIs);
        Card card = new Card(rand1, cardSuit, cardIs);
        //instantiate new card with rand1 as value and cardSuit as suit
    }

    private boolean checkCardUsed(int rand1, int rand2){
        // Check it is not in playedCards
        if (rand1 == -1 && rand2 == -1){
            return true;
        } //Makes the while a DoWhile

        String randSuit = "N";
        switch (rand2){ 
            case 0:
                randSuit = "S";
                break;
            case 1:
                randSuit = "H";
                break;
            case 2:
                randSuit = "C";
                break;
            case 3:
                randSuit = "D";
                break;
        } //Finds the randomly generated suit

        String randValue = "N";
        if (rand1 < 10){
            randValue = String.valueOf(rand1+1);
        }
        else{
            switch (rand1){
                case 10:
                    randValue = "J";
                    break;
                case 11:
                    randValue = "Q";
                    break;
                case 12:
                    randValue = "K";
                    break;
            } //Converts >10 valued cards to court cards
        } //Converts rand1 into the value of the card

        String genCard = randValue + randSuit; //Merge Value and Suit
        if (randValue == "N" || randSuit == "N"){
            return true;
        } //Catches errors
        else{
            for(int i = 0; i < playedCards.size(); i++){
                if (playedCards.get(i) == genCard){
                    return true;
                }
            }
            return false;
        } //Loops through playedCards[] to check if the card has been played yet
    }
}
