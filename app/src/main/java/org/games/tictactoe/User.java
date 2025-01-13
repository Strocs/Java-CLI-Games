package org.games.tictactoe;

import java.util.Scanner;

public class User implements Player {
  long id;
  String name;
  double sessionScore = 0;
  Scanner scanner;

  User(String name, Scanner scanner) {
    this.id = 0; // check id from DB
    this.name = name;
    this.scanner = scanner;
  }

  @Override
  public String play() {
    // return the user play
    return scanner.nextLine();
  }

  public void setScore(boolean winner) {
    double factor = winner ? 1 : -0.5;
    sessionScore += factor;
  }
}
