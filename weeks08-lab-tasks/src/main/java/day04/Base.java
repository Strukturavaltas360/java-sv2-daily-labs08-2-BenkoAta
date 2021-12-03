package day04;

public class Base {
    protected int readInt(String line, int from, int to) {
        return Integer.parseInt(line.substring(from, to).trim());
    }
}
