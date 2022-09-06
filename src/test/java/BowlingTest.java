import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingTest {

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,3",
            "4,4",
            "5,5",
            "6,6",
            "7,7",
            "8,8",
            "9,9"
    })
    public void should_return_score_when_int_string(String pins, int expectedScore) {
        assertEquals(expectedScore, new Bowling().scoreCalculus(pins));
    }

    @Test
    public void should_return_zero_when_miss() {
        assertEquals(0, new Bowling().scoreCalculus("-"));
    }

    @Test
    public void should_return_sum_of_frame() {
        assertEquals(8, new Bowling().scoreCalculus("17"));
    }

    @Test
    public void should_return_10_when_strike() {
        assertEquals(10, new Bowling().scoreCalculus("X"));
    }

    @Test
    public void should_return_10_when_something_spare() {
        assertEquals(10, new Bowling().scoreCalculus("-/"));
    }

    @Test
    public void should_return_5_when_small_match() {
        assertEquals(5, new Bowling().scoreCalculus("-3|-2"));
    }

    @Test
    public void should_return_20_when_X_3_2() {
        // X |3 |2
        // 13|3 |2 -> 18
        assertEquals(20, new Bowling().scoreCalculus("X|-3|-2"));
    }
    // X | -/ |5
    // 20|15|5 = 40
    // -/ |-/ |5
    // 10 |15 |5 = 30

}

