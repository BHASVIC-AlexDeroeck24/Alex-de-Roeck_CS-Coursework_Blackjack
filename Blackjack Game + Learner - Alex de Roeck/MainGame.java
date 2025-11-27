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
    Dealer dealer = new Dealer();
    Player player = new Player();
    Hand hand1 = new Hand();

    public MainGame()
    {    
        super(1200, 700, 1);
        System.out.println();
        System.out.println();
        System.out.println("-------------------- GAME START --------------------");
        System.out.println();
        
        //  Making objects such as buttons and boxes --------------------------------
        TotalValueCounter hand1Counter = new TotalValueCounter(hand1);
        addObject(hand1Counter, 500, 500);
        
        TotalValueCounter dealerHandCounter = new TotalValueCounter(dealer);
        addObject(dealerHandCounter, 695, 190);
        
        HitButton hitButton = new HitButton();
        addObject(hitButton, 690, 650);

        StandButton standButton = new StandButton();
        addObject(standButton, 835, 650);

        DoubleButton doubleButton = new DoubleButton();
        addObject(doubleButton, 980, 650);

        SplitButton splitButton = new SplitButton();
        addObject(splitButton, 1125, 650);

        MoneyBox moneyBox = new MoneyBox();
        addObject(moneyBox, 1052, 586);

        GreenfootImage image = getBackground();
        image.scale(1205, 700);
        setBackground(image);

        //  Game start --------------------------------
        deck.shuffleDeck();
        dealer.startDealer(this);
        hand1.startHand(this);
        
        //gameStart();
        playerTurn();
        
    }

    private void gameStart(){
        //
    }

    private void playerTurn(){
        player.setPlayerTurn(true);
        //while(player.getPlayerTurn() == true){
        //
        //}
    }


    public DeckOfCards getDeck()
    {
        return deck;
    }

    public Player getPlayer()
    {
        return player;
    }
    
    public Dealer getDealer()
    {
        return dealer;
    }
}
