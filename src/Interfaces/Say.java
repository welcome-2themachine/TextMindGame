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
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.*;
import javax.sound.sampled.Clip;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Brian
 */
public class Say {
    
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

public static void printf(Object words, Color color, String font, int fontSize, boolean bold, boolean italic)
{
    String s = words.toString();
    print("\n" + s, color, font, fontSize, bold, italic);
 
}

public static void normalSpeak(Object words, Color color, String font, int fontSize, boolean bold, boolean italic, int speed)
{ 
    String s = words.toString(); //the words to be spoken
    String array[] = s.split(""); //dont ask me to explain why this works
    int length = array.length; //how many characters are there being said?
    print("\n", color, font, fontSize, bold, italic); //gives me a new line
     
    //lets make them come out slowly
    for(int i=0; i<length; i++){
        print(array[i], color, font, fontSize, bold, italic);

            if (array[i] != " ")
                {
                    Sound.play("talk3.wav");
                }

        try {
            Thread.sleep(speed);
        } catch (InterruptedException ex) {
            Logger.getLogger(Say.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
}







