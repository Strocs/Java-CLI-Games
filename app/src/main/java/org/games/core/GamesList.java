package org.games.core;

public enum GamesList {
  TIC_TAC_TOE(1, "Tic Tac Toe");

  private final int id;
  private final String name;

  GamesList(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public static GamesList fromId(int id) {
    for (GamesList option : values()) {
      if (option.id == id)
        return option;
    }
    return null;
  }

  @Override
  public String toString() {
    return id + ") " + name;
  }
}
