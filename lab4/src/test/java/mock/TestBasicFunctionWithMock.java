package mock;

import functions.mathFunction.CalculatorBasicFunc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestBasicFunctionWithMock {

    private CalculatorBasicFunc mock;

    @Before
    public void setUp(){
        mock = mock(CalculatorBasicFunc.class);
        System.out.println("Before");

    }

    @After
    public void tearDown(){
        mock = null;
        System.out.println("After");

    }

    @Test
    public void MulMock(){
        //CalculatorBasicFunc mock = mock(CalculatorBasicFunc.class);
        when(mock.MultiplicationFunction( 1, 1)).thenReturn(9);
        int result = mock.MultiplicationFunction(1, 1);
        assertEquals(9, result);
    }

    @Test
    public void AddMock(){
        //CalculatorBasicFunc mock = mock(CalculatorBasicFunc.class);
        when(mock.AddFunction(1,1)).thenReturn(4);
        int result = mock.AddFunction(1, 1);
        assertEquals(4, result);
    }

    @Test
    public void DivMock(){
        when(mock.DivisionFunction(1,1)).thenReturn(10);
        int result = mock.DivisionFunction(1,1);
        assertNotNull(result);
    }
}
