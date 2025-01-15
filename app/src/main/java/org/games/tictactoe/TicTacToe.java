package org.games.tictactoe;

import java.util.Scanner;

import org.games.core.Game;
import org.games.core.User;
import org.games.utils.Screen;

public class TicTacToe implements Game {
  private static Scanner scanner;
  private HumanPlayer player;

  public TicTacToe(User player, Scanner sc) {
    scanner = sc;
    this.player = new HumanPlayer(sc, player);
  }

  @Override
  public void start() {
    Screen.clearScreen();

    String START_GAME_MSG = """
        ********************************
        *** Wellcome to StrocsTacToe ***
        ********************************

                Player: %s

        """;

    String START_GAME_SCREEN = String.format(START_GAME_MSG, player.name);

    Screen.printBlock(START_GAME_SCREEN);

    System.out.print("(n) New Game | (q) Quit\n");

    char action = scanner.next().charAt(0);

    switch (action) {
      case 'n':
        startGame();
        break;
      case 'q':
        return; // Exit game
    }
  }

  private void startGame() {
    Player machine = new ComputerPlayer();
    Score playerScore = new Score(player.id);
    Board board = new Board();

    boolean winner = false;

    // randomly define what player start

    Player[] players = { player, machine };

    int firstTurn = (int) (Math.random() * 2);
    int secondTurn = firstTurn == 0 ? 1 : 0;

    board.printBoard();

    do {
      int p1move = players[firstTurn].play();
      board.move(p1move);

      winner = board.isWinner(p1move);
      board.updateBoard(p1move);

      if (winner) {
        if (firstTurn == 0) {
          playerScore.setWins();
        } else {
          playerScore.setLoses();
        }
        return;
      }

      int p2move = players[secondTurn].play();
      board.move(p2move);
      board.updateBoard(p2move);

      if (winner) {
        if (firstTurn == 0) {
          playerScore.setWins();
        } else {
          playerScore.setLoses();
        }
        return;
      }
    } while (!winner);
  }
}
