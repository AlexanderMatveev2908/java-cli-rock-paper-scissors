package server.lib.dev;

import lombok.Getter;
import server.paperwork.Reg;

@Getter
public final class ErrApp extends RuntimeException {
  private final String msg;
  private final int code;

  public ErrApp(String msg, int code) {
    super(msg);
    this.msg = msg;
    this.code = code;
  }

  public ErrApp(String msg) {
    this(msg, 500);
  }

  public static void stdErr(String arg) {
    String emj = Reg.hasEmj(arg) ? "" : "❌ ";
    System.err.println(emj + arg);
  }

  public static void andExit(String arg) {
    stdErr(arg);
    System.exit(1);
  }
}
