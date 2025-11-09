package server.lib.data_structure;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class LibPrs {

  public static String firstCharUpper(String arg) {
    return arg.substring(0, 1).toUpperCase() + arg.substring(1).toLowerCase();
  }

  public static String titleCase(String arg) {
    if (!LibShape.hasTxt(arg))
      return arg;

    String[] words = arg.trim().split("\\s+");

    return Arrays.stream(words)
        .map(w -> w.isEmpty() ? w : firstCharUpper(w))
        .collect(Collectors.joining(" "));
  }
}
