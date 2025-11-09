package server.lib;

import java.util.concurrent.ThreadLocalRandom;

import server.lib.contexts.CtxScores;
import server.lib.dev.LibLog;
import server.paperwork.GameOpt;
import server.paperwork.GameResT;

public final class ManagerCLI {

  private static final ThreadLocalRandom RAND = ThreadLocalRandom.current();

  public static void byeIfBored() {
    LibLog.nextLine();
    System.out.println("✌🏼 bye");
    System.exit(0);
  }

  public static GameOpt cpuMove() {
    int randomIdx = RAND.nextInt(0, 2);
    return GameOpt.values()[randomIdx];
  }

  public static void assignPoints(CtxScores ctx, GameResT winner) {
    if (winner.equals(GameResT.US))
      ctx.setUser(ctx.getUser() + 1);
    else if (winner.equals(GameResT.CPU))
      ctx.setCpu(ctx.getCpu() + 1);
    else
      ctx.setTie(ctx.getTie() + 1);
  }
}
