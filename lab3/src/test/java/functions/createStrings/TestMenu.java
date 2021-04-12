package functions.createStrings;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMenu {

    private Menu menu;

    @Before
    public void setUp(){
        menu = new Menu();
        System.out.println("Before");
    }

    @After
    public void tearDown(){
        menu = null;
        System.out.println("After");

    }

    @Test
    public void showMenuTest(){
        assertEquals(menu.CreateMainMenu(), (
                "********************************\n" +
                        "** 1. Basic function(+,-,*,/) **\n" +
                        "** 2. NWD                     **\n" +
                        "** 3. NWW                     **\n" +
                        "** 4. Extend function(mod, )  **\n" +
                        "** 9. EXIT                    **\n" +
                        "********************************"));
    }

    @Test
    public void showBasicMenu(){
        assertNotNull(menu.CreateBasicMenu());
    }


    @Test
    public void showExtendMenu(){
        assertThat(menu.CreateExtendMenu(), containsString("** 1. Modulo                  **\n"));
    }
}
