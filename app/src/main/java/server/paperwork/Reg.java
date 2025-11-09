package server.paperwork;

import java.util.regex.Pattern;

import server.lib.data_structure.LibShape;

public class Reg {
  private static final Pattern EMJ = Pattern.compile("^\\s*[\\p{So}\\p{Cn}].*");

  private static boolean fullMatch(String arg, Pattern reg) {
    return LibShape.hasTxt(arg) && reg.matcher(arg).matches();
  }

  public static boolean hasEmj(String arg) {
    return fullMatch(arg, EMJ);
  }
}
