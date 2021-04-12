package functions.mathFunctions;

import functions.mathFunction.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestExtensionMathFunc {

    private ExtensionMathFunc extensionMathFunc;

    @Before
    public void setUp(){
        extensionMathFunc = new ExtensionMathFunc();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        extensionMathFunc = null;
        System.out.println("After");

    }

    @Test
    public void modTest(){
        assertEquals(extensionMathFunc.Modulo(345, 25), 20);
        assertEquals(extensionMathFunc.Modulo(126, 22), 16);
    }
}
