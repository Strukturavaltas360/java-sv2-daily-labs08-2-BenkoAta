package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public int findSmallestTemperatureSpread(String filename) {
        Path path = Paths.get("src/main/resources/day04/" + filename);
        DailyValue minSpread = null;
        for(DailyValue value: readDailyValues(path)) {
            if (minSpread == null || value.getSpread() < minSpread.getSpread()) {
                minSpread = value;
            }
        }
        return minSpread.getDay();
    }

    private List<DailyValue> readDailyValues(Path path) {
        List<DailyValue> values = new ArrayList<>();
        List<String> lines = null;
        try {
            lines = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file!", ioe);
        }
        for (int i = 2; i < lines.size() - 1; i++) {
            values.add(new DailyValue(lines.get(i)));
        }
        return values;
    }
}
