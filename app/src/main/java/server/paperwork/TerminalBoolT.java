package server.paperwork;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import server.lib.data_structure.LibShape;
import server.lib.dev.ErrApp;

@RequiredArgsConstructor
@Getter
public enum TerminalBoolT {
  YES("y"),
  NO("n");

  private final String val;

  public static final TerminalBoolT fromStr(String arg) {
    if (LibShape.hasTxt(arg))
      return java.util.Arrays.stream(TerminalBoolT.values())
          .filter(v -> v.getVal().equalsIgnoreCase(arg))
          .findFirst()
          .orElseThrow(() -> new ErrApp("invalid argument"));

    throw new ErrApp("invalid argument");
  }
}
