package org.games.tictactoe;

import org.games.utils.Screen;

public class Board {
  private final Integer[][] board = {
      { 8, 1, 6 },
      { 3, 5, 7 },
      { 4, 9, 2 }
  };

  public void printBoard() {
    String board = """
           1 | 2 | 3
          ---+---+---
           4 | 5 | 6
          ---+---+---
           7 | 8 | 9
        """;
    Screen.clearScreen();
    Screen.printBlock(board);
  }

  private void updateBoard(Integer[] coords) {
  }

  private Integer[] validateMove(String move) {
    Integer[] coords = new Integer[2];
    return coords;
  }

  public boolean checkWinner(String play) {
    Integer[] coords = validateMove(play);
    if (coords == null)
      return false;

    updateBoard(coords);
    return false;
  }

}
