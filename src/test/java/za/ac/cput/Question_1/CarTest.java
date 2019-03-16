package za.ac.cput.Question_1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CarTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test()
    {
        Honda honda = new Honda(0,0,"null");
        assertEquals(120,honda.getSpeed());
        assertEquals(5,honda.getGears());
        assertEquals("Honda",honda.getModel());

    }
}
