import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList; // For array lists
import java.util.Collections;   // Used to randomise the order of data in an ArrayList

public class DeckOfCards extends Actor
{
    ArrayList<Card> unusedCards = new ArrayList<Card>();    // UNUSED cards go here
    ArrayList<Card> inUseCards = new ArrayList<Card>();     // IN USE cards go here
    ArrayList<Card> playedCards = new ArrayList<Card>();    // PLAYED cards go here

    public void act()
    {
        // Add your action code here.
    }

    public void shuffleDeck()
    {
        // Puts all playedCards into the unusedCards ArrayList and randomises their order.
        unusedCards.addAll(inUseCards);
        unusedCards.addAll(playedCards);
        inUseCards.clear();
        playedCards.clear();
        Collections.shuffle(unusedCards);   // Randomises the order of the data in 'unusedCards'
    }

    public void dealCard(){
        //      

    }

    public void useCard(Card c){
        // Adds a passed card object to the 'inUseCards' ArrayList
        inUseCards.add(c);
        unusedCards.remove(c);
    }
    
    public void playCard(Card c){
        // Adds a passed card object to the 'playedCards' ArrayList
        playedCards.add(c);
        inUseCards.remove(c);
    }

    public void createDeck(){
        // Adds all card to 'unusedCards'
        // Card (int cardValue, int valueOfCard, String cardSuit, String cardIs)

        //SPADES ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "S", "AS")); //Ace of Spades
        unusedCards.add(new Card(2, 2, "S", "2S")); //Two of Spades
        unusedCards.add(new Card(3, 3, "S", "3S")); //Three of Spades
        unusedCards.add(new Card(4, 4, "S", "4S")); //Four of Spades
        unusedCards.add(new Card(5, 5, "S", "5S")); //Five of Spades
        unusedCards.add(new Card(6, 6, "S", "6S")); //Six of Spades
        unusedCards.add(new Card(7, 7, "S", "7S")); //Seven of Spades
        unusedCards.add(new Card(8, 8, "S", "8S")); //Eight of Spades
        unusedCards.add(new Card(9, 9, "S", "9S")); //Nine of Spades
        unusedCards.add(new Card(10, 10, "S", "10S")); //Ten of Spades
        unusedCards.add(new Card(11, 10, "S", "JS")); //Jack of Spades
        unusedCards.add(new Card(12, 10, "S", "QS")); //Queen of Spades
        unusedCards.add(new Card(13, 10, "S", "KS")); //King of Spades
        //-----------------------------------------------------------

        //HEARTS ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "H", "AH")); //Ace of Hearts
        unusedCards.add(new Card(2, 2, "H", "2H")); //Two of Hearts
        unusedCards.add(new Card(3, 3, "H", "3H")); //Three of Hearts
        unusedCards.add(new Card(4, 4, "H", "4H")); //Four of Hearts
        unusedCards.add(new Card(5, 5, "H", "5H")); //Five of Hearts
        unusedCards.add(new Card(6, 6, "H", "6H")); //Six of Hearts
        unusedCards.add(new Card(7, 7, "H", "7H")); //Seven of Hearts
        unusedCards.add(new Card(8, 8, "H", "8H")); //Eight of Hearts
        unusedCards.add(new Card(9, 9, "H", "9H")); //Nine of Hearts
        unusedCards.add(new Card(10, 10, "H", "10H")); //Ten of Hearts
        unusedCards.add(new Card(11, 10, "H", "JH")); //Jack of Hearts
        unusedCards.add(new Card(12, 10, "H", "QH")); //Queen of Hearts
        unusedCards.add(new Card(13, 10, "H", "KH")); //King of Hearts
        //-----------------------------------------------------------

        //CLUBS ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "C", "AC")); //Ace of Clubs
        unusedCards.add(new Card(2, 2, "C", "2C")); //Two of Clubs
        unusedCards.add(new Card(3, 3, "C", "3C")); //Three of Clubs
        unusedCards.add(new Card(4, 4, "C", "4C")); //Four of Clubs
        unusedCards.add(new Card(5, 5, "C", "5C")); //Five of Clubs
        unusedCards.add(new Card(6, 6, "C", "6C")); //Six of Clubs
        unusedCards.add(new Card(7, 7, "C", "7C")); //Seven of Clubs
        unusedCards.add(new Card(8, 8, "C", "8C")); //Eight of Clubs
        unusedCards.add(new Card(9, 9, "C", "9C")); //Nine of Clubs
        unusedCards.add(new Card(10, 10, "C", "10C")); //Ten of Clubs
        unusedCards.add(new Card(11, 10, "C", "JC")); //Jack of Clubs
        unusedCards.add(new Card(12, 10, "C", "QC")); //Queen of Clubs
        unusedCards.add(new Card(13, 10, "C", "KC")); //King of Clubs
        //-----------------------------------------------------------

        //DIAMONDS ----------------------------------------------------
        unusedCards.add(new Card(1, 11, "D", "AD")); //Ace of Diamonds
        unusedCards.add(new Card(2, 2, "D", "2D")); //Two of Diamonds
        unusedCards.add(new Card(3, 3, "D", "3D")); //Three of Diamonds
        unusedCards.add(new Card(4, 4, "D", "4D")); //Four of Diamonds
        unusedCards.add(new Card(5, 5, "D", "5D")); //Five of Diamonds
        unusedCards.add(new Card(6, 6, "D", "6D")); //Six of Diamonds
        unusedCards.add(new Card(7, 7, "D", "7D")); //Seven of Diamonds
        unusedCards.add(new Card(8, 8, "D", "8D")); //Eight of Diamonds
        unusedCards.add(new Card(9, 9, "D", "9D")); //Nine of Diamonds
        unusedCards.add(new Card(10, 10, "D", "10D")); //Ten of Diamonds
        unusedCards.add(new Card(11, 10, "D", "JD")); //Jack of Diamonds
        unusedCards.add(new Card(12, 10, "D", "QD")); //Queen of Diamonds
        unusedCards.add(new Card(13, 10, "D", "KD")); //King of Diamonds
        //-----------------------------------------------------------
    }

    // UNUSED CODE BELOW -----------------------------------------------------------------------------------------------------------------

    public void UNUSED_CODE1(){
        // Randomly select a card
        String cardValue = "N";
        String cardSuit = "N";
        int rand1 = -1;
        int rand2 = -1;

        // Might need to check if there are cards left in the deck later on **************************
        while (UNUSED_CODE2(rand1, rand2) == true){
            rand1 = Greenfoot.getRandomNumber(13); // (0 <= x < 13), one more than array because array starts at 0
            rand2 = Greenfoot.getRandomNumber(4);
        }

        if (rand1 < 10){
            cardValue = String.valueOf(rand1+1);
        }
        else{
            switch (rand1){
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
        } //Converts rand1 into the value of the card

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

        //String cardIs = cardValue + cardSuit;
        //playedCards.add(cardIs);
        //Card card = new Card(rand1, cardSuit, cardIs);
        //instantiate new card with rand1 as value and cardSuit as suit
    }

    private boolean UNUSED_CODE2(int rand1, int rand2){
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
        //else{
        //    for(int i = 0; i < playedCards.size(); i++){
        //       if (playedCards.get(i) == genCard){
        //            return true;
        //        }
        //    }
        return false;
        //} //Loops through playedCards[] to check if the card has been played yet
    }
}
