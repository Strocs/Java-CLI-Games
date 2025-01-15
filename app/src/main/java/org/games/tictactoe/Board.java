package org.games.tictactoe;

import org.games.utils.Screen;

public class Board {
  private final Integer[] boardValues = {
      8, 1, 6,
      3, 5, 7,
      4, 9, 2 };
  private String board = """
       🤖 Let's play Tic-Tac-Toe! 🎉
             ╔═══╦═══╦═══╗
             ║ 1 │ 2 │ 3 ║
             ╠═══╬═══╬═══╣
             ║ 4 │ 5 │ 6 ║
             ╠═══╬═══╬═══╣
             ║ 7 │ 8 │ 9 ║
             ╚═══╩═══╩═══╝
       👉 ¡It's your turn, human!
       😎 Choose a number:
      """;

  private int turn = 0;
  private String[] symbols = { "O", "X" };
  private int[][] playersMoves = {
      {},
      {}
  };

  public void printBoard() {
    Screen.clearScreen();
    Screen.printBlock(board);
  }

  public void updateBoard(int move) {
    Screen.clearScreen();
    board = board.replaceFirst(String.valueOf(move), symbols[turn]);
    Screen.printBlock(board);
  }

  private void validateMove(int move) {
    if (move < 1 || move > 9)
      throw new Error("The range is invalid. Please press a valid number.");
  }

  private void changeTurn() {
    turn = turn == 0 ? 1 : 0;
  }

  private void addMove(int move) {
    int value = boardValues[move - 1];
    int[] currentPlayerMoves = playersMoves[turn];
  }

  public boolean isWinner(int move) {
    return false;
  }

  public void move(int move) {
    validateMove(move);
    changeTurn();
  }
}
