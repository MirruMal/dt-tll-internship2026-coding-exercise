package com.dynatrace.pong.scoring;

public class Scoring {
    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public Scoring(){
        player1Score = 0;
        player2Score = 0;
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

    public int getWinner(int player1Score, int player2Score){
        if (isGameOver()){
            if (player1Score > player2Score+1 && player1Score >= 11){
                //System.out.println("Player 1 wins");
                return ;
            }
            if (player2Score > player1Score+1 && player2Score >= 11){
                //System.out.println("Player 2 wins");
                return true;
            }
            return false;

        }
    }




}
