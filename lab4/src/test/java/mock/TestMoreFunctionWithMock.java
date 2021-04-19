package mock;

import functions.mathFunction.MoreFunction;
import org.junit.*;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.BDDMockito.*;

public class TestMoreFunctionWithMock {

    private MoreFunction mo;

    @Before
    public void setUp(){
        mo = mock(MoreFunction.class);
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        mo = null;
        System.out.println("After");
    }

    @Test
    public void nwwMockTest(){
        when(mo.NWW(1,1)).thenReturn(72);
        int result = mo.NWW(1,1);
        assertEquals(72, result);

    }

    @Test
    public void nwdMockTest(){
        given(mo.NWD(1, 1)).willReturn(32);
        int result = mo.NWD(1,1);
        assertEquals(32, result);
    }

    @Test
    public void betterThenMockTest(){
        when(mo.betterThen(5,12)).thenReturn(true);
        boolean result = mo.betterThen(1,1);
        assertTrue(result);
    }

    @Test
    public void resultNotNull(){
        when(mo.NWD(1, 1)).thenReturn(any());
        int result = mo.NWD(1,1);
        assertNotNull(result);
    }
}
