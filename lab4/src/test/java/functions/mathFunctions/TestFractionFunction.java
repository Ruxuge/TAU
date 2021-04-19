package functions.mathFunctions;

import functions.mathFunction.FractionFunction;
import org.apache.commons.lang3.math.Fraction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestFractionFunction {

    private FractionFunction fractionFunction;
    private static Fraction f1, f2, f3, f4, result1, result2;

    @Before
    public void setUp(){
        fractionFunction = new FractionFunction();
        f1 = Fraction.getFraction(1, 3);
        f2 = Fraction.getFraction(5, 2);
        result1 = f1.add(f2);
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        fractionFunction = null;
        f1 = null;
        f2 = null;
        result1 = null;
        System.out.println("After");
    }

    @Test
    public void fractorTest(){
        assertTrue(fractionFunction.fractor(1, 3).equals(f1));
        assertTrue(fractionFunction.fractor(5, 2).equals(f2));
    }

    @Test
    public void addFractorTest(){
        assertTrue(fractionFunction.addFractor(1, 3, 5, 2).equals(result1));
    }

}
