package org.games.tictactoe;

public class Board {
  private final Integer[][] board = {
      { 8, 1, 6 },
      { 3, 5, 7 },
      { 4, 9, 2 }
  };

  public Board() {

  }

  public void printBoard() {
    System.out.print("\n");
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
