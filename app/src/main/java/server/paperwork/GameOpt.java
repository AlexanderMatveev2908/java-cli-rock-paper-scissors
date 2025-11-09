package server.paperwork;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum GameOpt {
    ROCK("R", "✊", "rock"),
    PAPER("P", "🖐️", "paper"),
    SCISSORS("S", "✌️", "scissors"),
    EXIT("_", "👋", "exit");

    private final String val;
    private final String emj;
    private final String txt;

}