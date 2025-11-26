import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Card extends Actor
{
    private int cardValue;
    private int valueOfCard;
    private String cardSuit;
    private String cardIs;
    private boolean faceDown;

    public void act()
    {
        // Make image the face up card unless face down
        if (faceDown){
            setImage("CardBack.png");
        }
        else{
            String imageFile = cardIs + ".png";
            setImage(imageFile);
        }
        setCardSize();
    }

    public Card (int cardVal, int valOfCard, String cardSu, String cardIS, boolean faceDOWN){
        this.cardValue = cardVal;
        this.valueOfCard = valOfCard;
        this.cardSuit = cardSu;
        this.cardIs = cardIS;
        this.faceDown = faceDOWN;
        setCardSize();
    }

    public void setCardSize(){
        GreenfootImage image = getImage();
        image.scale(78, 103);
        setImage(image);
    }
    
    public int getCardValue(){
        return this.valueOfCard;
    }

    public void faceDown(){
        this.faceDown = true;
    }
    
    public void faceUp(){
        this.faceDown = false;
    }
    
    //UNUSED CODE BELOW ---------------------------------------------------------------------------------------------------------------

    public void UNUSED_CODE1 (int cardVal, String cardSu, String cardIs){
        //cardSuit = cardSu; //String of Card Suit

        //if (cardVal < 10){
        //    cardValue = String.valueOf(cardVal+1);
        //}
        //else{
        //    switch (cardVal){
        //        case 10:
        //            cardValue = "J";
        //            break;
        //        case 11:
        //            cardValue = "Q";
        //            break;
        //        case 12:
        //            cardValue = "K";
        //            break;
        //    } //Converts >10 valued cards to court cards
        //} //Converts cardVal into the value of the card

        //if (cardVal > 10){
        //    valueOfCard = 10;
        //} //Sets valueOfCard to the value in Blackjack it has

    }
}