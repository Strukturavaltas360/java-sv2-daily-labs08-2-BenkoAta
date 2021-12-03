package day04;

public class FootballResult extends Base {
    private String team;
    private int goalsF;
    private int goalsA;

    public FootballResult(String line) {
        team = line.substring(7, 23).trim();
        goalsF = readInt(line, 43, 45);
        goalsA = readInt(line, 50, 52);
    }
    public int getDifference() {
        return goalsF - goalsA;
    }

    public String getTeam() {
        return team;
    }

    public int getGoalsF() {
        return goalsF;
    }

    public int getGoalsA() {
        return goalsA;
    }
}
