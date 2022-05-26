import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PracticeCountPrimeNumTest {
    Integer number;

    @Test
    public void nullCaseTest(){
        number=null;
        assertThrows(IllegalArgumentException.class,()-> Practice.primeNumberCounter(number));
    }
    @Test
    public void negativeCaseTest(){
        number=-1;
        assertThrows(IllegalArgumentException.class,()-> Practice.primeNumberCounter(number));
    }
    @Test
    public void primeNumberCounterCasesTest(){
        number=1;
        assertEquals("[1]",Practice.primeNumberCounter(number).toString());

        String expected="[1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]";
        number=100;
        assertEquals(expected,Practice.primeNumberCounter(number).toString());
    }
}