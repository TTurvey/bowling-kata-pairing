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


}

