package org.games.tictactoe;

import java.util.Scanner;

import org.games.core.Game;
import org.games.core.User;
import org.games.utils.Screen;

public class TicTacToe implements Game {
  private static Scanner scanner;
  private Player player;

  public TicTacToe(User player, Scanner sc) {
    scanner = sc;
    this.player = new Player(sc, player);
  }

  @Override
  public void start() {
    Screen.clearScreen();
    Screen.printBlock("""
        ********************************
        *** Wellcome to StrocsTacToe ***
        ********************************
              Player:

        """);

    System.out.print("(n) New Game | (q) Quit\n");

    char action = scanner.next().charAt(0);

    switch (action) {
      case 'n':
        startGame();
      case 'q':
        return; // Exit game
    }
  }

  private void startGame() {
    Computer machine = new Computer();
    Score playerScore = new Score(player.id);
    Board board = new Board();

    boolean winner = false;

    // randomly define what player start

    do {
      board.printBoard();

      System.out.print("Choose your play: ");
      winner = board.checkWinner(player.play());
      // player 1 play

      // play first based on what player start
      // maybe save the turns on an array with the instance: {player1, player2}

      board.printBoard();

      // If player win do:
      if (winner) {
        playerScore.setWins();
        return;
      }

      winner = board.checkWinner(machine.play());

      if (winner) {
        playerScore.setLoses();
        return;
      }

      // if player not win in this round, computer plays and check winner
      // if nobody won this turn, go to next until a winner is found

    } while (!winner);
  }
}
