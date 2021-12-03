package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void findSmallestTemperatureSpread() {
        FileReader reader = new FileReader();
        int day = reader.findSmallestTemperatureSpread("weather.dat");
        assertEquals(14, day);
    }

    @Test
    void findSmallestDifference() {
        assertEquals("Aston_Villa", new FileReader().findSmallestDifference("football.dat"));
    }
}