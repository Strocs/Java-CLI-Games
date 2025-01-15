package org.games.tictactoe;

import java.util.Scanner;

import org.games.core.User;

public class Player {
  long id;
  String name;
  Scanner scanner;

  Player(Scanner scanner, User user) {
    this.id = user.id;
    this.name = user.name;
    this.scanner = scanner;
  }

  String play() {
    String play = scanner.nextLine();
    return play;
  }
}
