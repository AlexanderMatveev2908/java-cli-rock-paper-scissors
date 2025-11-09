package server.paperwork;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum GameResT {
  US("US", "🎉", "User"),
  CPU("CPU", "👻", "CPU"),
  T("T", "🤝", "Tie");

  private final String val;
  private final String emj;
  private final String label;

}
