package org.games.tictactoe;

public class Player {
  public int id;
  public String name;
  public Score score;

  Player(String name) {
    this.id = 0;
    this.name = name;
    this.score = new Score();
  }
}
