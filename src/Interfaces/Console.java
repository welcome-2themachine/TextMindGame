/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Brian
 */
public class Console 
{
    
    public void main(String[] args)
    {
        new Console();
    }
    //declaring variables
    public JFrame frame;
    public JTextPane console;
    public JTextField input;
    public JScrollPane scrollpane;    
    public StyledDocument document;
    
    public Console()
    {
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception ex){}
        
        //setting up the JFrame name and action on exit
        frame = new JFrame();
        frame.setTitle("TextGame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the program on window close
        
        //output pane settings
        console = new JTextPane();  
        console.setEditable(false);
        console.setFont(new Font("Lucida Console", Font.PLAIN, 14));
        console.setOpaque(false);//to view the black background, this must not be opaque
        
        document = console.getStyledDocument();
        
        //input window setup
        input = new JTextField();
        input.setFont(new Font("Lucida Console", Font.PLAIN, 14));
        input.setEditable(true);
        input.setForeground(Color.WHITE);
        input.setCaret(new BlockCaret()); //block caret compliments of DWM
        input.setOpaque(false);  
        
        //input window listeners
        input.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String text = input.getText();
                
                if (text.length() > 1)
                { 
                    doCommand(text);
                    scrollBottom();
                    input.selectAll(); //highlights text when enter is pressed                    
                }
            }
        });        
        input.addKeyListener(new KeyListener()
        {
            public void keyPressed(KeyEvent e){}
            public void keyReleased(KeyEvent e){}
            public void keyTyped(KeyEvent e){}
        });
    
        //scroll pane setup
        scrollpane = new JScrollPane(console);
        scrollpane.setBorder(null);
        scrollpane.setOpaque(false); //to view the black background, this must not be opaque
        scrollpane.getViewport().setOpaque(false);//to view the black background, this must not be opaque
        
        //some general window settings
        frame.add(input, BorderLayout.SOUTH); //placing the input field at the bottom
        frame.add(scrollpane, BorderLayout.CENTER);   
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setSize(800, 400); //window default size
        frame.setLocationRelativeTo(null); //centers window on screen        
        frame.setResizable(true);
        frame.setVisible(true);
       
    }
    


public void scrollTop()
{
console.setCaretPosition(0);
}

public void scrollBottom()
{
console.setCaretPosition(console.getDocument().getLength());
}

//print call
public void print(String s)
{
   print(s, new Color(255, 255, 255));
}
 //print call with color
public void print(String s, Color c)
{
    Style style = console.addStyle("Style", null);
    StyleConstants.setForeground(style, c);
 
    try
    {
        document.insertString(document.getLength(), s, style);
    }
    catch (Exception ex){}
}

//println call
public void println(Object o)
{
    String s = o.toString();
    println(s+"\n", new Color(255,255,255));
}

//println call with color
public void println(Object o, Color c)
{
    String s = o.toString();
    print(s + "\n", c);
}


public void clear()
{
    try
    {
        document.remove(0, document.getLength());
    }
    catch (Exception ex){}
}

//using a command
public void doCommand(String s)
{
final String[] commands = s.split(" ");

try
{
    //the clear command
    if (commands[0].equalsIgnoreCase("clear"))
    {
        clear();
    }
    else
    {
        println(s, new Color(255,255,255));
    }
}
catch (Exception ex)
{
    println("Error -> " + ex.getMessage(), new Color(255,155,155));
}

}


}