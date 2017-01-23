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
        Say.print("One Word. ");
        Say.print("Two Words. ");
        Say.print("All on the same line.");
        Say.println("But this returns another line");
        Say.println("And this returns a different color", new Color(255,0,0));
        Say.printf("This is formatted", new Color(255, 255, 255), "Arial", 22, true, false);
        Say.println("This returns to normal");
        Say.normalSpeak("THIS IS THE BEGINNING OF THE WORLD.", Color.yellow, "Castellar", 24, true, false, 100);

        
        

        //TEST CODE
        
    }
    
}
