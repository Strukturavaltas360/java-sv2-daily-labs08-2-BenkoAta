package day04;

public class DailyValue extends Base {
    private int day;
    private int maxTemp;
    private int minTemp;

    public DailyValue(String line) {
        day = Integer.parseInt(line.substring(2, 4).trim());
        maxTemp = readInt(line, 6, 8);
        minTemp = readInt(line, 12, 14);
    }

    public int getSpread() {
        return maxTemp - minTemp;
    }

    public int getDay() {
        return day;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }
}
