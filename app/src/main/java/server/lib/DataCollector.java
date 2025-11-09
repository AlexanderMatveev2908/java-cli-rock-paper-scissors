package server.lib;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import server.lib.dev.ErrApp;
import server.paperwork.GameOpt;

public class DataCollector {
  private static final Scanner SC = new Scanner(System.in, StandardCharsets.UTF_8);

  public static GameOpt gameOpt() {
    while (true) {
      System.out.print("choose your move: ");

      String ch = SC.nextLine().trim();

      switch (ch) {
        case "1":
          return GameOpt.ROCK;
        case "2":
          return GameOpt.PAPER;
        case "3":
          return GameOpt.SCISSORS;
        case "4":
          return GameOpt.EXIT;
        default:
          ErrApp.stdErr("❌ invalid option");
      }
    }
  }
}
