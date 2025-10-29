/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;

import java.util.Random;

/**
 *
 * @author RC_Student_lab
 */
public class ComputerPlayer extends Player {
    
    private Random rand = new Random();     //for the computer to produce random rock, paper, scissor
    private static final String[] MOVES = {"rock", "paper", "scissors"};

    public ComputerPlayer(String name) {
        super(name);
    }

    @Override
    public String makeMove() {
        return MOVES[rand.nextInt(3)];
    }
}
