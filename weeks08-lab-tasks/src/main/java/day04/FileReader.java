package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public String findSmallestDifference(String filename) {
        FootballResult minDiff = null;
        for(FootballResult value: readFootballResults(getPath(filename))) {
            if (minDiff == null || Math.abs(value.getDifference()) < Math.abs(minDiff.getDifference())) {
                minDiff = value;
            }
        }
        return minDiff.getTeam();
    }

    public int findSmallestTemperatureSpread(String filename) {
        DailyValue minSpread = null;
        for(DailyValue value: readDailyValues(getPath(filename))) {
            if (minSpread == null || value.getSpread() < minSpread.getSpread()) {
                minSpread = value;
            }
        }
        return minSpread.getDay();
    }

    private Path getPath(String filename) {
        return Paths.get("src/main/resources/day04/" + filename);
    }

    private List<FootballResult> readFootballResults(Path path) {
        List<FootballResult> values = new ArrayList<>();
        List<String> lines = readLines(path);
        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            if (!line.contains("---")) {
                values.add(new FootballResult(lines.get(i)));
            }
        }
        return values;
    }

    private List<DailyValue> readDailyValues(Path path) {
        List<DailyValue> values = new ArrayList<>();
        List<String> lines = readLines(path);
        for (int i = 2; i < lines.size() - 1; i++) {
            values.add(new DailyValue(lines.get(i)));
        }
        return values;
    }

    private List<String> readLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
    }
}
