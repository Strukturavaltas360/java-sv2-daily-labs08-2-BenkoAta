package day04;

public class FootballResult {
    private String team;
    private int goalsF;
    private int goalsA;

    public FootballResult(String line) {
        team = line.substring(7, 23).trim();
        goalsF = Integer.parseInt(line.substring(43, 45).trim());
        goalsA = Integer.parseInt(line.substring(50, 52).trim());
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
