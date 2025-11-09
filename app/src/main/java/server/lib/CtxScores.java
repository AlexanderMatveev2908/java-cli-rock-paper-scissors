package server.lib;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class CtxScores {
  private int user;
  private int cpu;
  private int tie;
}
