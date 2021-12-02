package day04;

public class DailyValue {
    private int day;
    private int maxTemp;
    private int minTemp;

    public DailyValue(String line) {
        String st = line.substring(2, 4).trim();
        day = Integer.parseInt(st);
        st = line.substring(6, 8).trim();
        maxTemp = Integer.parseInt(st);
        st = line.substring(12, 14).trim();
        minTemp = Integer.parseInt(st);
    }

    public DailyValue(int day, int maxTemp, int minTemp) {
        this.day = day;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
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
