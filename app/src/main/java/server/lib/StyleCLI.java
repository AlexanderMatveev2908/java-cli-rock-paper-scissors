package server.lib;

import server.lib.contexts.CtxMoves;
import server.lib.contexts.CtxScores;
import server.lib.data_structure.LibPrs;
import server.lib.dev.LibLog;
import server.paperwork.GameOptT;
import server.paperwork.GameResT;

public final class StyleCLI {

  private static final String side = "=".repeat(5);
  private static final String space = (" ".repeat(3));

  public static final void intro() {
    LibLog.afterLines();

    final StringBuilder sb = new StringBuilder();

    sb.append(
        side);
    sb.append(" ☕ Java CLI Rock-Paper-Scissors 🕹️ ");
    sb.append(
        side);

    final String str = sb.toString();

    System.out.println(str);
  }

  public static final void score(CtxScores ctx) {
    LibLog.emptyLine();

    System.out.println("😎 user -> " + ctx.getUser());
    System.out.println("💾 cpu -> " + ctx.getCpu());
    System.out.println("🤝 tie -> " + ctx.getTie());
  }

  public static final void options() {
    LibLog.emptyLine();

    final GameOptT[] opt = GameOptT.values();

    for (int i = 0; i < opt.length; i++) {
      final GameOptT curr = opt[i];

      final StringBuilder sb = new StringBuilder();
      sb.append(i + 1);
      sb.append(". ");
      sb.append(curr.getEmj());
      sb.append(" -> ");
      sb.append(LibPrs.firstCharUpper(curr.getLabel()));

      final String str = sb.toString();
      System.out.println(str);
    }
  }

  public static final void choices(CtxMoves ctx) {
    final StringBuilder sb = new StringBuilder();

    sb.append("user " + ctx.user().getEmj());
    sb.append(space);
    sb.append("vs");
    sb.append(space);
    sb.append(ctx.cpu().getEmj());
    sb.append(" CPU");

    System.out.println(sb.toString());
  }

  public static final void feedbackResult(GameResT arg) {
    final StringBuilder sb = new StringBuilder();

    sb.append(arg.getLabel() + " ");
    if (!arg.equals(GameResT.T))
      sb.append("win ");
    sb.append(arg.getEmj());

    System.out.println(sb.toString());
  }
}
