/*
 * 
 */
package textgame;

import textgame.Items.Item;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author chris
 */
public class ItemIT {
    
    public ItemIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Item.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Item instance = new Item("bob", 5.4, true);
        String expResult = "bob";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeight method, of class Item.
     */
    @Test
    public void testGetWeight() {
        System.out.println("getWeight");
        Item instance = new Item("bob", 5.4, true);
        double expResult = 5.4;
        double result = instance.getWeight();
        assertEquals(expResult, result, 0.0);
    }
    
}
