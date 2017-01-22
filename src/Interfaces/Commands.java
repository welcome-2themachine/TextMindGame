package Interfaces;

import static Interfaces.Cons.document;
import java.awt.Color;

/**
 * Where commands are programmed
 * @author Brian
 */
public class Commands {
    
    //clear commands
     public static void clear()
    {
        try
    {
        document.remove(0, document.getLength());
    }
    catch (Exception ex){}
    }
     
     //all my movement commands
     public static void moveWhere()
     {
         Say.println("Where would you like to move?", new Color(0,127,255));
     }
    
    public static void moveNorth()
    {
        try
        {
            Say.println("You head north.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }  
    
    public static void moveNorthEast()
    {
        try
        {
            Say.println("You head northeast.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveEast()
    {
        try
        {
            Say.println("You head east.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveSouthEast()
    {
        try
        {
            Say.println("You head southeast.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveSouth()
    {
        try
        {
            Say.println("You head south.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveSouthWest()
    {
        try
        {
            Say.println("You head southwest.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveWest()
    {
        try
        {
            Say.println("You head west.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveNorthWest()
    {
        try
        {
            Say.println("You head northwest.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    public static void moveUp()
    {
        try
        {
            Say.println("You head upwards.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    public static void moveDown()
    {
        try
        {
            Say.println("You head downwards.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Say.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
}
