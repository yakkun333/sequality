/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
        public void testAppReternHelloWorld() {
        App classUnderTest = new App();
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }

    @Test
        public void testAppSumAve1() {
        App classUnderTest = new App();
        assertEquals("Sum of " + 2 + " and " + 3 + " is " + 5 + ".Average is " + 2.5 + ".", classUnderTest.SumAve1(2,3));
    }

    @Test
        public void testAppSumAve2() {
        App classUnderTest = new App();
        assertEquals("Sum of " + 1 + " to " + 10 + " is " + 55 + ".Average is " + 5.5 + ".", classUnderTest.SumAve2(1,10));
    }

    @Test
        public void testAppSumAve3() {
        App classUnderTest = new App();
        assertEquals("Sum of odd of " + 1 + " to " + 10 + " is " + 25 + ".Sum of even is " + 30 + ".", classUnderTest.SumAve3(1,10));
    }
}
