package server.lib;

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
}
