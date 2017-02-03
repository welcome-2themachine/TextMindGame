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
        Sound.play("Opening.wav");
        Say.wait(3500);
        Say.normalSpeak("Hello", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("I know you don't remember me...", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("...but I thought I should talk to you anyway.", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("Everything is different now.", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("But it isn't all bad.", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("They've all grown up quite well.", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("And none of them have done wrong.", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("They miss you.", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(3000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("And I miss you...", Color.yellow, "Castellar", 24, true, false, 100);
        Say.wait(5000);
        Commands.clear();
        Say.wait(3000);
        Say.normalSpeak("...but it's time for you to go.", Color.yellow, "Castellar", 24, true, false, 100);
    //TEST CODE    
    }
    
}
