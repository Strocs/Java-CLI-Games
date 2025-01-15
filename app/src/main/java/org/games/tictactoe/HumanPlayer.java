package org.games.tictactoe;

import java.util.Scanner;

import org.games.core.User;

public class HumanPlayer extends Player {
  long id;
  String name;
  Scanner scanner;

  HumanPlayer(Scanner scanner, User user) {
    this.id = user.id;
    this.name = user.name;
    this.scanner = scanner;
  }

  @Override
  int play() {
    while (true) {
      if (scanner.hasNextInt()) {
        int play = scanner.nextInt();
        if (play >= 1 && play <= 9) {
          return play;
        } else {
          System.out.println("Invalid move. Please enter a number between 1 and 9.");
        }
      } else {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.next();
      }
    }
  }
}
