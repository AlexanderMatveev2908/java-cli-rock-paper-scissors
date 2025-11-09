package server.lib;

import server.lib.data_structure.LibPrs;
import server.lib.dev.LibLog;
import server.paperwork.GameOpt;
import server.paperwork.GameResT;

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

  public static void score(CtxScores ctx) {
    LibLog.nextLine();

    System.out.println("😎 user -> " + ctx.getUser());
    System.out.println("💾 cpu -> " + ctx.getCpu());
    System.out.println("🤝 tie -> " + ctx.getTie());
  }

  public static void options() {
    LibLog.nextLine();

    GameOpt[] opt = GameOpt.values();

    for (int i = 0; i < opt.length; i++) {
      GameOpt curr = opt[i];

      StringBuilder sb = new StringBuilder();
      sb.append(i + 1);
      sb.append(". ");
      sb.append(curr.getEmj());
      sb.append(" -> ");
      sb.append(LibPrs.firstCharUpper(curr.getTxt()));

      String str = sb.toString();
      System.out.println(str);
    }
  }

  public static void feedbackResult(GameResT arg) {
    LibLog.nextLine();

    StringBuilder sb = new StringBuilder();

    if (arg.equals(GameResT.US))
      sb.append("You win ");
    else if (arg.equals(GameResT.CPU))
      sb.append("CPU win ");
    else
      sb.append("Tie ");

    sb.append(arg.getEmj());

    System.out.println(sb.toString());
  }
}
