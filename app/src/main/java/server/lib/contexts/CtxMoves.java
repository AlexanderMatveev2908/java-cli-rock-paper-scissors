package server.lib.contexts;

import java.util.Map;

import server.paperwork.GameOpt;
import server.paperwork.GameResT;

public final record CtxMoves(GameOpt user, GameOpt cpu) {

  private static final Map<String, String> mapWins = Map.of("R", "S", "S", "P", "P", "R");

  public GameResT getWinner() {

    if (mapWins.get(user.getVal()).equals(cpu.getVal()))
      return GameResT.US;
    else if (mapWins.get(cpu.getVal()).equals(user.getVal()))
      return GameResT.CPU;
    else
      return GameResT.T;

  }
}