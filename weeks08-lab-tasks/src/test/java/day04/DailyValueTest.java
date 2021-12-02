package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DailyValueTest {
    @Test
    void createTest() {
        DailyValue value = new DailyValue("   1  88    59    74          53.8       0.00 F       280  9.6 270  17  1.6  93 23 1004.5");
        assertEquals(1, value.getDay());
        assertEquals(88, value.getMaxTemp());
        assertEquals(59, value.getMinTemp());
        assertEquals(88 - 59, value.getSpread());
        value = new DailyValue("  30  90    45    68          63.6       0.00 H       240  6.0 220  17  4.8 200 41 1022.7");
        assertEquals(30, value.getDay());
        assertEquals(90, value.getMaxTemp());
        assertEquals(45, value.getMinTemp());
        assertEquals(90 - 45, value.getSpread());
    }

}