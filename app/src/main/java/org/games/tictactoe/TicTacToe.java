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
    Player player1 = new Player(name);

    do {
      System.out.print("\f Player: " + player1.name);
    } while (true);
  }

}
