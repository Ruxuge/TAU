package functions.createStrings;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class TestHello {

    private Hello hello;

    @Before
    public void setUp(){
        hello = new Hello();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        hello = null;
        System.out.println("After");

    }

    @Test
    public void SayHelloTest() {
        assertThat(hello.sayHello(), containsString("Hello"));
    }

}
