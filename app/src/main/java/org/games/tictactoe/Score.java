package org.games.tictactoe;

public class Score {
  private int[] score = { 0, 0 };
  private double globalRating = 0;

  public double getGlobalScore() {
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
