package org.games.tictactoe;

public class ComputerPlayer extends Player {

  @Override
  public int play() {
    // Get random play
    int randomMove = (int) (Math.random() * 9) + 1;
    return randomMove;
  }
}
