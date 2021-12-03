package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballResultTest {
    @Test
    void createTest() {
        FootballResult fr;
        fr = new FootballResult("    1. Arsenal-------- 38    26   9   3    79  -  36    87");
        assertEquals("Arsenal--------", fr.getTeam());
        assertEquals(79, fr.getGoalsF());
        assertEquals(36, fr.getGoalsA());
        assertEquals(79 - 36, fr.getDifference());
        fr = new FootballResult("   20. Leicester       38     5  13  20    30  -  64    28");
        assertEquals("Leicester", fr.getTeam());
        assertEquals(30, fr.getGoalsF());
        assertEquals(64, fr.getGoalsA());
        assertEquals(30 - 64, fr.getDifference());
    }

}