package org.games.utils;

public class Screen {
  static String clear = "\033[2J";
  static String moveToStart = "\033[H";

  public static void printBlock(String content) {
    System.out.print(content);
  }

  public static void clearScreen() {
    System.out.print(clear);
    System.out.print(moveToStart);
  }
}
