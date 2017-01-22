/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import static Interfaces.Cons.document;
import java.awt.Color;

/**
 * Where command Parsing is handled, but not where commands occur.
 * @author Brian
 */
public class CommandParsing {
    
    public static void doCommand(String s){
    final String[] commands = s.split(" ");

    //list of commands
    if ((commands[0].equalsIgnoreCase("clear")) || (commands[0].equalsIgnoreCase("cls")))
        {
        Commands.clear();
        }

    else if (commands[0].equalsIgnoreCase("move") && commands.length<2)
    {
        Commands.moveWhere();
    }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("north")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("n")) ||
            (commands[0].equalsIgnoreCase("north") && commands.length<2) || 
            (commands[0].equalsIgnoreCase("n")))
        {
            Commands.moveNorth();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("north") && commands[2].equalsIgnoreCase("east")) ||
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("northeast")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("ne")) ||
            (commands[0].equalsIgnoreCase("north") && commands[1].equalsIgnoreCase("east")) || 
            (commands[0].equalsIgnoreCase("northeast")) ||
            (commands[0].equalsIgnoreCase("ne"))
            )
        {
            Commands.moveNorthEast();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("east")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("e")) ||
            (commands[0].equalsIgnoreCase("east") && commands.length<2) ||
            (commands[0].equalsIgnoreCase("e")))
        {
            Commands.moveEast();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("south") && commands[2].equalsIgnoreCase("east")) ||
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("southeast")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("se")) ||
            (commands[0].equalsIgnoreCase("south") && commands[1].equalsIgnoreCase("east")) || 
            (commands[0].equalsIgnoreCase("southeast")) ||
            (commands[0].equalsIgnoreCase("se")))
        {
            Commands.moveSouthEast();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("south")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("s")) ||
            (commands[0].equalsIgnoreCase("south") && commands.length<2) ||
            (commands[0].equalsIgnoreCase("s")))
        {
            Commands.moveSouth();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("south") && commands[2].equalsIgnoreCase("west")) ||
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("southwest")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("sw")) ||
            (commands[0].equalsIgnoreCase("south") && commands[1].equalsIgnoreCase("west")) || 
            (commands[0].equalsIgnoreCase("southwest")) ||
            (commands[0].equalsIgnoreCase("sw")))
        {
            Commands.moveSouthWest();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("west")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("w")) ||
            (commands[0].equalsIgnoreCase("west") && commands.length<2) ||
            (commands[0].equalsIgnoreCase("w")))
        {
            Commands.moveWest();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("north") && commands[2].equalsIgnoreCase("west")) ||
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("northwest")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("nw")) ||
            (commands[0].equalsIgnoreCase("north") && commands[1].equalsIgnoreCase("west")) || 
            (commands[0].equalsIgnoreCase("northwest")) ||
            (commands[0].equalsIgnoreCase("nw")))
        {
            Commands.moveNorthWest();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("up")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("u")) ||
            (commands[0].equalsIgnoreCase("up") && commands.length<2) ||
            (commands[0].equalsIgnoreCase("u")))
        {
            Commands.moveUp();
        }
    else if ((commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("down")) || 
            (commands[0].equalsIgnoreCase("move") && commands[1].equalsIgnoreCase("d")) ||
            (commands[0].equalsIgnoreCase("down") && commands.length<2) ||
            (commands[0].equalsIgnoreCase("d")))
        {
            Commands.moveDown();
        }
    else
        {
        Say.println(s, new Color(255,255,255));
        }
    
    
   
}
}
