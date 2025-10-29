/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class HumanPlayer extends Player {
    
    private Scanner scan;

    public HumanPlayer(String name, Scanner scanner) {
        super(name);
        this.scan = scanner;
    }

    @Override
    public String makeMove() {
        System.out.print(getName() + ", enter rock, paper, or scissors: ");
        String move = scan.nextLine().toLowerCase();
        while (!move.equals("rock") && !move.equals("paper") && !move.equals("scissors")) {
            System.out.print("Invalid choice! Try again: ");
            move = scan.nextLine().toLowerCase();
        }
        return move;
    }
}
