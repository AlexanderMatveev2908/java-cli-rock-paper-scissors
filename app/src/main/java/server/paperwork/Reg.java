package server.paperwork;

import java.util.regex.Pattern;

import server.lib.data_structure.LibShape;

public final class Reg {
  private static final Pattern EMJ = Pattern.compile("^\\s*[\\p{So}\\p{Cn}].*");

  private static final boolean fullMatch(String arg, Pattern reg) {
    return LibShape.hasTxt(arg) && reg.matcher(arg).matches();
  }

  public static final boolean hasEmj(String arg) {
    return fullMatch(arg, EMJ);
  }
}
