package server.paperwork;

public enum GameOpt {
    ROCK("R", "✊", "rock"),
    PAPER("P", "🖐️", "paper"),
    SCISSORS("S", "✌️", "scissors"),
    EXIT("_", "👋", "exit");

    private final String val;
    private final String emj;
    private final String txt;

    GameOpt(String val, String emj, String txt) {
        this.emj = emj;
        this.val = val;
        this.txt = txt;
    }

    public String getVal() {
        return val;
    }

    public String getEmoji() {
        return emj;
    }

    public String getTxt() {
        return txt;
    }
}