package server.paperwork;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum GameResT {
  US("US", "🎉", "user"),
  CPU("CPU", "👻", "cpu"),
  T("T", "🤝", "tie");

  private final String val;
  private final String emj;
  private final String txt;

}
