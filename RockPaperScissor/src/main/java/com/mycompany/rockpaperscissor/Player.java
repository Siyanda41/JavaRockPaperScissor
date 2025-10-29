/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rockpaperscissor;

/**
 *
 * @author RC_Student_lab
 */
public abstract class Player {
    
    private String name;
    private int wins;

    //constructor
    public Player(String name) {
        this.name = name;
        this.wins = 0;
    }

    //getters and setters
    public String getName() { 
        return name; 
    }
    public int getWins() { 
        return wins; 
    }
    public void addWin() { 
        wins++; 
    }

    public abstract String makeMove();
    
}
