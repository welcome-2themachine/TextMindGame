/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Cons.document;
import java.awt.Color;

/**
 *
 * @author Brian
 */
public class CommandParsing {
    
    public static void clear()
    {
        try
    {
        document.remove(0, document.getLength());
    }
    catch (Exception ex){}
    }
    
    public static void moveNorth()
    {
        try
        {
            Cons.println("You head north.", new Color(0,127,255));
        }
        catch (Exception ex)
        {
            Cons.println("You cannot travel in that direction.", new Color(255,0,0));
        }
    }
    
    public static void moveCommand()
    {
    }
    
}
