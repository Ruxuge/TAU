package functions.mathFunctions;

import functions.mathFunction.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculatorBasicFunc {

    private CalculatorBasicFunc calculatorBasicFunc;

    @Before
    public void setUp(){
        calculatorBasicFunc = new CalculatorBasicFunc();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        calculatorBasicFunc = null;
        System.out.println("After");

    }

    @Test
    public void addTest(){
        assertEquals(calculatorBasicFunc.AddFunction(5, 5), 10 );
        assertEquals(calculatorBasicFunc.AddFunction(10, 13), 23);
    }

    @Test
    public void multiplicationTest(){
        assertEquals(calculatorBasicFunc.MultiplicationFunction(10, 3), 30);
        assertEquals(calculatorBasicFunc.MultiplicationFunction(3, 9), 27);
    }

    @Test
    public void subtractionTest() {
        assertEquals(calculatorBasicFunc.SubtractionFunction(10, 3), 7);
        assertEquals(calculatorBasicFunc.SubtractionFunction(37, 17), 20);
    }

    @Test
    public void divisionTest() {
        assertEquals(calculatorBasicFunc.DivisionFunction(10, 2), 5);
        assertEquals(calculatorBasicFunc.DivisionFunction(40, 5), 8);
    }
}
