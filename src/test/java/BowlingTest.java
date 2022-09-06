import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingTest {


    @Test
    public void should_return_0_when_no_pins_hit() {
        assertEquals(0, new Bowling().scoreCalculus("0"));
    }

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
}

