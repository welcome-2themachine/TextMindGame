/*
 * 
 */
package textgame.Main;

import java.util.Scanner;
import Interfaces.*;
import java.awt.Color;

/**
 *
 * @author chris
 */
public class TextGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing game window
        //GameInterface Game = new GameInterface();
        //Game.createAndShowGUI();
        
        new Cons();
        Scanner kb = new Scanner(System.in);        
        
        //Prevost, check out how to print stuff to the console:
        Cons.print("One Word. ");
        Cons.print("Two Words. ");
        Cons.print("All on the same line.");
        Cons.println("But this returns another line");
        Cons.println("And this returns a different color", new Color(255,0,0));
        
 
        
        

        //TEST CODE
        
    }
    
}
