/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.rockpaperscissor;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class GameTest {
    
    class TestPlayer extends Player {
        private String fixedMove;
        public TestPlayer(String name, String move) {
            super(name);
            this.fixedMove = move;
        }
        @Override
        public String makeMove() {
            return fixedMove;
        }
    }

    @Test
    public void testRockBeatsScissors() {
        Player rockPlayer = new TestPlayer("Rocky", "rock");
        Player scissorPlayer = new TestPlayer("Scissy", "scissors");
        Game game = new Game(new Player[]{rockPlayer, scissorPlayer}, 1);

        game.play();

        assertEquals(1, rockPlayer.getWins(), "Rock should win against scissors");
        assertEquals(0, scissorPlayer.getWins(), "Scissors should not win against rock");
    }

    @Test
    public void testPaperBeatsRock() {
        Player paperPlayer = new TestPlayer("Pappy", "paper");
        Player rockPlayer = new TestPlayer("Rocky", "rock");
        Game game = new Game(new Player[]{paperPlayer, rockPlayer}, 1);

        game.play();

        assertEquals(1, paperPlayer.getWins(), "Paper should win against rock");
        assertEquals(0, rockPlayer.getWins(), "Rock should not win against paper");
    }

    @Test
    public void testDrawCase() {
        Player player1 = new TestPlayer("Twin1", "rock");
        Player player2 = new TestPlayer("Twin2", "rock");
        Game game = new Game(new Player[]{player1, player2}, 1);

        game.play();

        assertEquals(0, player1.getWins(), "No wins should be recorded in a draw");
        assertEquals(0, player2.getWins(), "No wins should be recorded in a draw");
    }

    @Test
    public void testMultipleRounds() {
        Player player1 = new TestPlayer("Tester1", "rock");
        Player player2 = new TestPlayer("Tester2", "scissors");
        Game game = new Game(new Player[]{player1, player2}, 3);

        game.play();

        assertEquals(3, player1.getWins(), "Rock should win all 3 rounds against scissors");
        assertEquals(0, player2.getWins(), "Scissors should lose all 3 rounds against rock");
    }
    
}
