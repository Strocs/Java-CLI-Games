package org.games.tictactoe;

public class Score {
  private long playerId;
  private int[] score = { 0, 0 };
  private double globalRating = 0;

  public Score(long playerId) {
    this.playerId = playerId;
  }

  public double getGlobalScore(long id) {
    if (id != this.playerId) {
      System.out.println("");

      return 0;
    }
    return globalRating;
  }

  private void calculateGlobalScore() {
    int wins = score[0];
    int loses = score[1];
    globalRating = wins * 0.6 - loses * 0.4;
  }

  public void setWins() {
    score[0]++;
    calculateGlobalScore();
  }

  public void setLoses() {
    score[1]++;
    calculateGlobalScore();
  }

  public int getWins() {
    return score[0];
  }

  public int getLoses() {
    return score[1];
  }

}
