package org.games.core;

import java.util.Scanner;

import org.games.tictactoe.TicTacToe;
import org.games.utils.Screen;

public class Main {
  private static boolean running = true;
  private static Scanner scanner;

  public static void main(String[] args) {
    Screen.clearScreen();
    Screen.printBlock(Texts.START_MSG);

    scanner = new Scanner(System.in);
    System.out.print(Texts.CHOOSE_NAME);
    String name = scanner.nextLine();

    User player = new User(name);

    do {
      printMenu();
      int selection = getUserSelection();
      startGame(selection, player);
    } while (running);

    scanner.close();
  }

  private static void printMenu() {
    System.out.println("\nSelect a game: ");
    for (GamesList game : GamesList.values()) {
      System.out.println(game);
    }
  }

  private static int getUserSelection() {
    while (true) {
      System.out.print("\nPlease enter the letter of the game, or type (q) to exit: ");
      char selection = scanner.next().charAt(0);

      for (int i = 0; i < GamesList.values().length; i++) {
        if (selection == '1' + i)
          return i + 1;
      }

      if (selection == 'q') {
        System.out.println("Exiting...");
        running = false;
        return 0;
      }

      System.out.println("\nPlease enter a valid selection.");
    }
  }

  private static void startGame(int selection, User player) {
    if (selection == 0)
      return;

    Game game = switch (selection) {
      case 1 -> new TicTacToe(player, scanner);
      case 2 -> null;
      default -> null;
    };

    if (game != null) {
      game.start();
    } else {
      System.out.println("Game doest not exist.");
    }
  }
}
