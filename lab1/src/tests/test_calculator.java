package tests;

import static org.junit.Assert.*;

import main.MyCalculator;
import org.junit.*;
import org.junit.jupiter.api.BeforeAll;

public class test_calculator {
    private MyCalculator myCalculator;

    @Before
    public void setUp(){
        myCalculator = new MyCalculator();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        myCalculator = null;
        System.out.println("After");
    }

    @Test
    public void testInsertNumber(){

        System.out.println("TestInsertNumber");
    }

    @Test
    public void testAddFunction(){
        int firstNumber = 2;
        int secondNumber = 2;
        int result = myCalculator.AddFunction(firstNumber, secondNumber);
        assertEquals(4, result);
        System.out.println("TestAddFunction");
    }

    @Test
    public void testSubtractionFunction(){
        int firstNumber = 5;
        int secondNumber = 3;
        int result = myCalculator.SubtractionFunction(firstNumber, secondNumber);
        assertEquals(2, result);
        System.out.println("TestSubtractionFunction");
    }

    @Test
    public void testMultiplicationFunction(){
        int firstNumber = 5;
        int secondNumber = 3;
        int result = myCalculator.MultiplicationFunction(firstNumber, secondNumber);
        assertEquals(15, result);
        System.out.println("TestSubtractionFunction");
    }

    @Test
    public void testDivisionFunction(){
        int firstNumber = 10;
        int secondNumber = 2;
        int result = myCalculator.DivisionFunction(firstNumber, secondNumber);
        assertEquals(5, result);
        System.out.println("TestSubtractionFunction");
    }
}
