/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Cons.Cons;
import static Interfaces.Cons.document;
import static Interfaces.Say.print;
import java.awt.Color;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Brian
 */
public class Say {
    
    public static void print(String s)
{
   print(s, new Color(255, 255, 255));
}
 //print call with color
public static void print(String s, Color c)
{
    Style style = Cons.addStyle("Style", null);
    StyleConstants.setForeground(style, c);
 
    try
    {
        document.insertString(document.getLength(), s, style);
    }
    catch (Exception ex){}
}

//println call
public static void println(Object o)
{
    String s = o.toString();
    println("\n" + s, new Color(255,255,255));
}

//println call with color
public static void println(Object o, Color c)
{
    String s = o.toString();
    print("\n" + s, c);
}
    
}
