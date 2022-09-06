import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BowlingTest {


    @Test
    public void should_return_0_when_no_pins_hit() {
        assertEquals(0, new Bowling().scoreCalculus("0"));
    }

    @Test
    public void should_return_1_when_1_pin() {
        assertEquals(1, new Bowling().scoreCalculus("1"));
    }


}

