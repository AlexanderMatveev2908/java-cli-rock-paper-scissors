package server.lib;

import server.lib.data_structure.LibPrs;
import server.lib.dev.LibLog;
import server.paperwork.GameOpt;

public final class StyleCLI {

  private static final String side = "=".repeat(5);

  public static void intro() {
    StringBuilder sb = new StringBuilder();

    sb.append(
        side);
    sb.append(" ☕ Java CLI Rock-Paper-Scissors 🕹️ ");
    sb.append(
        side);

    String str = sb.toString();

    System.out.println(str);
  }

  public static void score(int userScore, int cpuScore) {
    LibLog.nextLine();

    System.out.println("😎 user -> " + userScore);
    System.out.println("💾 cpu -> " + userScore);
  }

  public static void score() {
    score(0, 0);
  }

  public static void options() {
    LibLog.nextLine();

    GameOpt[] opt = GameOpt.values();

    for (int i = 0; i < opt.length; i++) {
      GameOpt curr = opt[i];

      StringBuilder sb = new StringBuilder();
      sb.append(i + 1);
      sb.append(". ");
      sb.append(curr.getEmoji());
      sb.append(" -> ");
      sb.append(LibPrs.firstCharUpper(curr.getTxt()));

      String str = sb.toString();
      System.out.println(str);
    }
  }
}
