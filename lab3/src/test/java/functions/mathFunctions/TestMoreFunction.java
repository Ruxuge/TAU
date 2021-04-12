package functions.mathFunctions;

import functions.mathFunction.MoreFunction;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestMoreFunction {

    private MoreFunction moreFunction;

    @Before
    public void setUp(){
        moreFunction = new MoreFunction();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        moreFunction = null;
        System.out.println("After");

    }

    @Test
    public void nwdTest(){
        assertEquals(moreFunction.NWD(36, 24), 12);
        assertEquals(moreFunction.NWD(288, 128), 32);
    }

    @Test
    public void nwwTest(){
        assertEquals(moreFunction.NWW(24, 36), 72);
        assertEquals(moreFunction.NWW(12, 32), 96);
    }

    @Test
    public void betterThenTest(){
        assertTrue(moreFunction.betterThen(43, 34));
        assertFalse(moreFunction.betterThen(34,43));
    }
}
