package za.ac.cput.Question_2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import za.ac.cput.Question_2.Honda;

/**
 * Unit test for Question 2
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
