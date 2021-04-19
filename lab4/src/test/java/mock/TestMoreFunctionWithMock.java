package mock;

import functions.mathFunction.MoreFunction;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class TestMoreFunctionWithMock {

    /*@Mock
    MoreFunction mock;

    @Before
    public void setUp(){
        mock = mock(MoreFunction.class);
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        mock = null;
        System.out.println("After");
    }*/

    @Test
    public void NWWStaticMock(){
        //assertEquals(96, MoreFunction.NWW(32,12));

        try (MockedStatic<MoreFunction> theMock = Mockito.mockStatic(MoreFunction.class)){
            theMock.when(() -> MoreFunction.NWW(1,1))
                    .thenReturn(96);
        }
    }

    @Test
    public void NWDStaticMock(){
        assertEquals(3, MoreFunction.NWD(126,33));

        try (MockedStatic<MoreFunction> theMock = Mockito.mockStatic(MoreFunction.class)){
            theMock.when(() -> MoreFunction.NWD(1,1))
                    .thenReturn(3);
        }
    }

    /*@Test
    public void nwwMockTest(){
        when(mock.NWW(1,1)).thenReturn(72);
        int result = mock.NWW(1,1);
        assertEquals(72, result);

    }

    @Test
    public void nwdMockTest(){
        given(mock.NWD(1, 1)).willReturn(32);
        int result = mock.NWD(1,1);
        assertEquals(32, result);
    }

    @Test
    public void betterThenMockTest(){
        when(mock.betterThen(5,12)).thenReturn(true);
        boolean result = mock.betterThen(1,1);
        assertTrue(result);
    }

    @Test
    public void resultNotNull(){
        when(mock.NWD(1, 1)).thenReturn(any());
        int result = mock.NWD(1,1);
        assertNotNull(result);
    }*/
}
