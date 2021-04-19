package functions.createStrings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestClock {
    private Clock clock;

    @Before
    public void setUp(){
        clock = new Clock();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        clock = null;
        System.out.println("After");

    }

    @Test
    public void localTime() {
        assertNotNull(clock.currentTime());
    }
}
