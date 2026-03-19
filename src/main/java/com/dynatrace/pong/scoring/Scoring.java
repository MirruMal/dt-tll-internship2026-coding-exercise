package com.dynatrace.pong.scoring;
import com.dynatrace.pong.model.Player;

public class Scoring {
    private int player1Score;
    private int player2Score;
    private Player player1;
    private Player player2;

    public Scoring(){
        player1Score = 0;
        player2Score = 0;
        this.player1 = player1;
        this.player2 = player2;

    }

    public int getPlayer1Score(){
        return player1Score;
    }

    public int getPlayer2Score(){
        return player2Score;
    }



    public boolean isGameOver(){
        if (player1Score > player2Score+1 && player1Score >= 11){
            //System.out.println("Player 1 wins");
            return true;
        }
        if (player2Score > player1Score+1 && player2Score >= 11){
            //System.out.println("Player 2 wins");
            return true;
        }
        return false;
    };

    public void setPlayer1Score(int player1Score){
        this.player1Score = player1Score;
    }

    public void setPlayer2Score(int player2Score){
        this.player2Score = player2Score;
    }

    public String getWinner(int player1Score, int player2Score){
        if (isGameOver()){
            if (player1Score > player2Score+1 && player1Score >= 11){
                //System.out.println("Player 1 wins");
                return player1Name;
            }
            if (player2Score > player1Score+1 && player2Score >= 11){
                //System.out.println("Player 2 wins");
                return player2Name;
            }

        }
        return null;
    }

    public int Player1Scored(){
        setPlayer1Score(player1Score+1);
        return player1Score;
    }

    public int Player2Scored(){
        setPlayer1Score(player2Score+1);
        return player2Score;
    }




}
