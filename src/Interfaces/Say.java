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
    
    public static void wait(int time)
    {
        try {
               Thread.sleep(time);
        } catch (InterruptedException ex) {
            println("Error with wait command.");
        }
    }
    
    //The main print call. This is how everything is printed
   public static void print(String s, Color color, String font, int size, boolean bold, boolean italic)
   {
       Style style = Cons.addStyle("Style", null);
       StyleConstants.setForeground(style, color);
       StyleConstants.setFontFamily(style, font);
       StyleConstants.setFontSize(style, size);
       StyleConstants.setBold(style, bold);
       StyleConstants.setItalic(style, italic);

       try
       {
           document.insertString(document.getLength(), s, style);
       }
       catch (Exception ex){}
   }

   //the baseline print, and the common format for the window unless specified by the other methods listed below.
       public static void print(String s)
   {
      print(s, new Color(255, 255, 255), "Lucida Console", 14, false, false);
      //  text to print, color,            font,     font size, bold, italic
   }

   //println call
   public static void println(Object words)
   {
       String s = words.toString();
       print("\n" + s, new Color(255,255,255), "Lucida Console", 14, false, false);
   }

   //println call with color
   public static void println(Object words, Color c)
   {
       String s = words.toString();
       print("\n" + s, c, "Lucida Console", 14, false, false);
   }

   //printline with more formatting. all self explanitory
   public static void printf(Object words, Color color, String font, int fontSize, boolean bold, boolean italic)
   {
       String s = words.toString();
       print("\n" + s, color, font, fontSize, bold, italic);

   }

   //how to get the text to print out special-like with sound
   public static void normalSpeak(Object words, Color color, String font, int fontSize, boolean bold, boolean italic, int speed)
   { 
       String s = words.toString(); //the words to be spoken
       String array[] = s.split(""); //dont ask me to explain why this works
       int length = array.length; //how many characters are there being said?
       print("\n", color, font, fontSize, bold, italic); //gives me a new line

       //lets make them come out slowly
       for(int i=0; i<length; i++){
           print(array[i], color, font, fontSize, bold, italic);

               //if character is not whitespace, play sound
               if (!Character.isWhitespace(s.charAt(i)))
                   {
                       Sound.play("talk3.wav");
                   }
            //instead of writing out the try-catch code every time I want to pause, 
            //I made a wait method inside of the Say class. 
            //The "speed" is in miliseconds. 1000 = 1 second.
            Say.wait(speed);
       }
       }
   }







