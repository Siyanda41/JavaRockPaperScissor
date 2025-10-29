/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;

/**
 *
 * @author RC_Student_lab
 */
public class Game {
    
    private Player[] players;
    private String[] roundWinners;
    private int totalRounds;

    //my constructor
    public Game(Player[] players, int totalRounds) {
        this.players = players;
        this.totalRounds = totalRounds;
        this.roundWinners = new String[totalRounds];
    }

    //deciding a who won the game
    private int decideWinner(String m1, String m2) {
        if (m1.equals(m2)) return 0;
        if ((m1.equals("rock") && m2.equals("scissors")) ||
            (m1.equals("paper") && m2.equals("rock")) ||
            (m1.equals("scissors") && m2.equals("paper"))) return 1;
        return 2;
    }

    public void play() {
        for (int i = 0; i < totalRounds; i++) {
            System.out.println("\n--- Round " + (i + 1) + " ---");
            String move1 = players[0].makeMove();
            String move2 = players[1].makeMove();
            System.out.println(players[0].getName() + " chose " + move1);
            System.out.println(players[1].getName() + " chose " + move2);

            int result = decideWinner(move1, move2);
            if (result == 0) {
                roundWinners[i] = "Draw";
                System.out.println("It's a draw!");
            } else if (result == 1) {
                players[0].addWin();
                roundWinners[i] = players[0].getName();
                System.out.println(players[0].getName() + " wins!");
            } else {
                players[1].addWin();
                roundWinners[i] = players[1].getName();
                System.out.println(players[1].getName() + " wins!");
            }
        }
        printReport();
    }
    
    //printing the report 
    private void printReport() {
        System.out.println("\n-------GAME REPORT -------");
        for (int i = 0; i < totalRounds; i++) {
            System.out.println("Round " + (i + 1) + ": " + roundWinners[i]);
        }
        System.out.println("\nFinal Scores:");
        System.out.println(players[0].getName() + ": " + players[0].getWins());
        System.out.println(players[1].getName() + ": " + players[1].getWins());

        if (players[0].getWins() > players[1].getWins()) {
            System.out.println("Overall Winner: " + players[0].getName());
        } else if (players[1].getWins() > players[0].getWins()) {
            System.out.println("Overall Winner: " + players[1].getName());
        } else {
            System.out.println("The game is a Draw!");
        }
    }
    
}
