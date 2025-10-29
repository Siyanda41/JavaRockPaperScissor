/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class RockPaperScissor {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: "); //enter your name
        String name = scan.nextLine();

        System.out.print("How many rounds do you want to play? ");
        int rounds = scan.nextInt();
        scan.nextLine(); // consume leftover newline

        Player human = new HumanPlayer(name, scan);
        Player computer = new ComputerPlayer("Computer");

        Game game = new Game(new Player[]{human, computer}, rounds);
        game.play();
    }
        
    
}
