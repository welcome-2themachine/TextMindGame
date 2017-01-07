/*
 * 
 */
package textgame;

import Interfaces.Inventory;
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
public class InventoryIT {
    
    public InventoryIT() {
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
     * Test of addItem method, of class Inventory.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Item addMe = new Item("Wrench", 1.5, false);
        Inventory instance = new Inventory(3);
        String expResult = "Wrench has been added to inventory.";
        String result = instance.addItem(addMe);
        assertEquals(expResult, result);
    }
/**
     * Test of addItem method, of class Inventory.
     */
    @Test
    public void testAddHeavyItem() {
        System.out.println("addItem");
        Item addMe = new Item("Wrench", 1.5, false);
        Inventory instance = new Inventory(1);
        String expResult = "Wrench is too heavy to carry.";
        String result = instance.addItem(addMe);
        assertEquals(expResult, result);
    }
    /**
     * Test of dropItem method, of class Inventory.
     */
    @Test
    public void testDropItem() {
        System.out.println("dropItem");
        Item terry = new Item("Wrench", 1.5, false);
        String name = "Terry";
        Inventory instance = new Inventory(4);
        instance.addItem(terry);
        String expResult = "Terry has been removed. Let's hope you don't need it later.";
        String result = instance.dropItem(name);
        assertEquals(expResult, result);
    }
    /**
     * Test of dropItem method, of class Inventory.
     */
    @Test
    public void testCantDropItem() {
        System.out.println("cantdropItem");
        Item terry = new Item("Wrench", 1.5, false);
        String name = "Terry";
        Inventory instance = new Inventory(4);
        String expResult = "Unable to locate item. Are you sure you didn't leave it somewhere?";
        String result = instance.dropItem(name);
        assertEquals(expResult, result);
    }
}
