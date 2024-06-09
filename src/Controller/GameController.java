package Controller;

import Enums.GameState;
import Models.Cell;
import Models.Game;

import java.util.List;

public class GameController {
// Create new game
// Display the Board
// Check Winner and If game state = PROGRESS
    // Make move
    // Update the board and display the board

// Check game state
    //Handle Draw
    //Handle Winner
    //Handle Pause
    Game game;
    public void startGame() {
        game = new Game();
    }

    public void displayBoard() {
        game.getBoard().printBoard();
    }

    public void makeMove() {

    }

    public GameState checkState() {
        return null;
    }

}
