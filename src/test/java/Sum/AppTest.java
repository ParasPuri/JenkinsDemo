package Sum;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public void test() {
    	
    	App addTest = new App();
    	int result = addTest.add(10, 40);
    	assertEquals(50, result);
    }
    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
