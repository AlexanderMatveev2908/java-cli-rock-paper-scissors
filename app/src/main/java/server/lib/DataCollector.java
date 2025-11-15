package server.lib;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import server.lib.dev.ErrApp;
import server.lib.dev.LibLog;
import server.paperwork.GameOptT;
import server.paperwork.TerminalBoolT;

public final class DataCollector {
  private static final Scanner SC = new Scanner(System.in, StandardCharsets.UTF_8);

  public static final GameOptT gameOpt() {
    while (true) {
      System.out.print("choose your move: ");

      final String ch = SC.nextLine().trim();

      switch (ch) {
        case "1":
          return GameOptT.ROCK;
        case "2":
          return GameOptT.PAPER;
        case "3":
          return GameOptT.SCISSORS;
        case "4":
          return GameOptT.EXIT;
        default:
          ErrApp.stdErr("❌ invalid option");
      }
    }
  }

  public static final TerminalBoolT playAgain() {
    LibLog.emptyLine();

    System.out.println("Play again? y/n");

    while (true) {
      final String ch = SC.nextLine().strip().toLowerCase();

      try {
        return TerminalBoolT.fromStr(ch);
      } catch (Exception err) {
        ErrApp.stdErr("invalid choice");
      }
    }
  }
}
