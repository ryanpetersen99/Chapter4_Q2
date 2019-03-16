package za.ac.cput;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
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
        Honda honda = new Honda();
        honda.setMethod(5,120,"Honda");
        assertNotEquals("The car model is Honda",honda.toString());

    }
}
