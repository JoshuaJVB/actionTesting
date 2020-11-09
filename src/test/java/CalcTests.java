import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalcTests {

    Calc calc;

    @BeforeEach
    void setUp(){
        calc = new Calc();
    }

    @Test
    void testAdd(){
        int actual = calc.add(1,2);
        int expected = 3;

        assertEquals(expected,actual);
    }

    @Test
    void testSub(){
        int actual = calc.sub(3,2);
        int expected = 1;

        assertEquals(expected,actual);
    }

    @Test
    void failTest(){
        fail();
    }

}
