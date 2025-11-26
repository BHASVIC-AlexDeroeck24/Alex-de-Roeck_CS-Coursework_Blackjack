import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainGame extends World
{
    DeckOfCards deck = new DeckOfCards();
    //Dealer dealer = new Dealer();
    Player player = new Player();
    
    
    
    public MainGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 350, 1);
        //deck.shuffleDeck();
        GreenfootImage image = getImage(); // Get the current image
        image.scale(image.getWidth() - 10, image.getHeight() - 10); // Scale down by 10 pixels
        setImage(image); // Set the resized image back to the actor
        //gameStart();
        //playerTurn();
        //dealerTurn();
    }
    
    private void gameStart(){
        //
    }
    
    private void playerTurn(){
        player.setPlayerTurn(true);
        while(player.getPlayerTurn() == true){
            //
        }
    }
    /**
    private void dealerTurn(){
        while (dealer.getHandTotal() < 17){
            dealer.hit();
        }
        if (dealer.getHandTotal() > 21){
            dealer.lost();
        }
        else{
            dealer.stand();
            
            for (int i = 0; i < player.getLastHand(); i++){
                
                
                //  IF THE PLAYER'S HAND HAS ALREADY GONE BUST (DEALER HAND WINS)
                if ( player.getPlayerHand(i).getHandLost() == true ){
                    System.out.println("Player's hand " + player.getPlayerHand(i) + " has lost, it went bust.");
                }
                
                //  IF THE PLAYER'S HAND TOTAL IS LESS THAN DEALER'S (DEALER HAND WINS)
                if ( player.getPlayerHand(i).getHandTotal() < dealer.getHandTotal() ){
                    player.getPlayerHand(i).setHandLost(true);
                    System.out.println("Player's hand " + player.getPlayerHand(i) + " has lost, the dealer beat it.");
                }
                
                //  IF THE PLAYER'S HAND TOTAL IS MORE THAN DEALER'S (PLAYER HAND WINS)
                if ( player.getPlayerHand(i).getHandTotal() < dealer.getHandTotal() ){
                    player.getPlayerHand(i).setHandLost(true);
                    System.out.println("Player's hand " + player.getPlayerHand(i) + " has won, the dealer hand had less.");
                }
                
                
            }
            
        }
    }
    */
    public DeckOfCards getDeck()
    {
        return deck;
    }
    
    public Player getPlayer()
    {
        return player;
    }
}
