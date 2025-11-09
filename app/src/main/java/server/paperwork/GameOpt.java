package server.paperwork;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum GameOpt {
    ROCK("R", "✊", "Rock"),
    PAPER("P", "🖐️", "Paper"),
    SCISSORS("S", "✌️", "Scissors"),
    EXIT("_", "👋", "Exit");

    private final String val;
    private final String emj;
    private final String label;

}