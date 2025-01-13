package org.games.tictactoe;

public class Computer implements Player {
  double sessionScore = 0;

  @Override
  public String play() {
    // Get random play
    return "";
  }

  public void setScore(boolean winner) {
    double factor = winner ? 1 : -0.5;
    sessionScore += factor;
  }

}
