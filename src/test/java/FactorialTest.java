import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by coura on 11.04.2016.
 */

public class FactorialTest {

    private static Factorial factorial;

    @BeforeClass
    public static void setUpClass() throws Exception {
        factorial = new Factorial();
    }

    @Test
    public void testSearchOfFactorialNull() throws Exception {
        int number = 0;
        int result = factorial.searchOfFactorial(number);
        assertEquals(1, result);
    }

    @Test
    public void testSearchOfFactorialOne() throws Exception {
        int number = 1;
        int result = factorial.searchOfFactorial(number);
        assertEquals(1, result);
    }

    @Test
    public void testSearchOfFactorialFive() throws Exception {
        int number = 5;
        int result = factorial.searchOfFactorial(number);
        assertEquals(120, result);
    }
}