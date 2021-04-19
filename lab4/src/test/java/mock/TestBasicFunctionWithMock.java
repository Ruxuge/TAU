package mock;

import functions.mathFunction.CalculatorBasicFunc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.internal.matchers.NotNull;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestBasicFunctionWithMock {


    /*@Mock
    CalculatorBasicFunc mock;

    @Before
    public void setUp(){
        mock = mock(CalculatorBasicFunc.class);
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        mock = null;
        System.out.println("After");
    }*/

    @Test
    public void mulStaticMock(){
        assertEquals(9, CalculatorBasicFunc.MultiplicationFunction(3,3));

        try (MockedStatic<CalculatorBasicFunc> theMock = Mockito.mockStatic(CalculatorBasicFunc.class)){
            theMock.when(() -> CalculatorBasicFunc.MultiplicationFunction(1, 1))
                    .thenReturn(9);
        }
    }

    @Test
    public void AddStaticMock(){
        assertEquals(9, CalculatorBasicFunc.AddFunction(3,3));

        try (MockedStatic<CalculatorBasicFunc> theMock = Mockito.mockStatic(CalculatorBasicFunc.class)){
            theMock.when(() -> CalculatorBasicFunc.AddFunction(1, 1))
                    .thenReturn(9);
        }
    }

    @Test
    public void DivStaticMock(){
        assertEquals(9, CalculatorBasicFunc.DivisionFunction(3,3));

        try (MockedStatic<CalculatorBasicFunc> theMock = Mockito.mockStatic(CalculatorBasicFunc.class)){
            theMock.when(() -> CalculatorBasicFunc.DivisionFunction(1, 1))
                    .thenReturn(9);
        }
    }


/*
    @Test
    public void MulMock(){
        //CalculatorBasicFunc mock = mock(CalculatorBasicFunc.class);
        when(CalculatorBasicFunc.MultiplicationFunction( 1, 1)).thenReturn(9);
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
    }*/
}
