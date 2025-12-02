import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InformationOutputter extends Actor
{
    public void act()
    {
        // Add your action code here.
    }

    public InformationOutputter (World world)
    {
        MainGame mainGame = (MainGame)world;
        Player player = mainGame.getPlayer();
        Dealer dealer = mainGame.getDealer();

        int textSize = 40;

        int playerHandTotal = player.getPlayerHand(0).getHandTotal();
        boolean playerHandLost = player.getPlayerHand(0).getHandLost();
        int dealerHandTotal = dealer.getHandTotal();
        boolean dealerLost = dealer.checkDealerLost();
        int winnings = dealer.getWinnings();
        int wager = player.getTotalBet();
        int balance = player.getPlayerMoney();
        boolean blackjack = player.getPlayerHand(0).getBlackjack();

        if (playerHandLost && !dealerLost){
            setImage(new GreenfootImage(" YOU LOST, YOU WENT BUST \n Your Hand Total = "
                    + playerHandTotal + ", Dealer hand total = " + dealerHandTotal + " "
                    + "\n Wager Lost = " + wager + ", Balance = " + balance + " ", textSize, Color.RED, Color.BLACK));
        } // GAME END --- 'PLAYER WENT BUST'

        else if ( (!playerHandLost && !dealerLost) && playerHandTotal == dealerHandTotal ){
            setImage(new GreenfootImage(" YOU DREW \n Your Hand Total = " 
                    + playerHandTotal + ", Dealer hand total = " + dealerHandTotal + " "
                    + "\n Wager Returned = " + wager + ", Balance = " + balance + " "
                , textSize, Color.YELLOW, Color.BLACK));
        } // GAME END --- 'PUSH'

        else if ( (!playerHandLost && dealerLost) || (playerHandTotal > dealerHandTotal) ){
            if (blackjack)
            {
                setImage(new GreenfootImage(" BLACKJACK!! YOU WON \n Your Hand Total = "
                        + playerHandTotal + ", Dealer hand total = " + dealerHandTotal + " "
                        + "\n Winnings = " + winnings + ", Balance = " + balance + " "
                    , textSize, Color.GREEN, Color.BLACK));
            }
            else{
                setImage(new GreenfootImage(" YOU WON \n Your Hand Total = "
                        + playerHandTotal + ", Dealer hand total = " + dealerHandTotal + " "
                        + "\n Winnings = " + winnings + ", Balance = " + balance + " "
                    , textSize, Color.GREEN, Color.BLACK));
            }
        } // GAME END --- 'PLAYER WON'

        else{
            setImage(new GreenfootImage(" ERROR \n Your Hand Total = " + playerHandTotal + ", Dealer hand total = "
            + dealerHandTotal + " ", textSize, Color.RED, Color.BLACK));
        }
    }
}
