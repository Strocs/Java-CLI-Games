package org.games.tictactoe;

import java.util.Scanner;

import org.games.Game;

public class TicTacToe implements Game {
  private static Scanner scanner;

  public TicTacToe(Scanner sc) {
    scanner = sc;
  }

  @Override
  public void start() {
    System.out.println(
        "\f\n******************************\n** Wellcome to StrocsTacToe **\n******************************\n");

    System.out.print("(n) New Game | (q) Quit\n");

    char action = scanner.next().charAt(0);

    switch (action) {
      case 'n':
        startGame();
      case 'q':
        return; // Exit game
    }
  }

  private static void startGame() {
    System.out.print("Choose a name: ");
    String name = scanner.nextLine();

    User player = new User(name, scanner);
    Computer machine = new Computer();

    Board board = new Board();

    // randomly define what player start

    do {
      board.printBoard();

      System.out.print("Choose your play: ");
      String play = player.play();

      // play first based on what player start
      // maybe save the turns on an array with the instance: {player1, player2}
      boolean winner = board.checkWinner(play);

      // If player win do:
      if (winner) {
        player.setScore(winner);
        machine.setScore(!winner);
      }

      // if player not win in this round, computer plays and check winner
      // if nobody won this turn, go to next until a winner is found

    } while (true);
  }

}
