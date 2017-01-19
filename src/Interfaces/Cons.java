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
public class Cons 
{
    
    public void main(String[] args)
    {
        new Cons();
    }
    //declaring variables
    public JFrame frame;
    public static JTextPane Cons;
    public JTextField input;
    public JScrollPane scrollpane;    
    public static StyledDocument document;
    
    public Cons()
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
        Cons = new JTextPane();  
        Cons.setEditable(false);
        Cons.setFont(new Font("Lucida Console", Font.PLAIN, 14));
        Cons.setOpaque(false);//to view the black background, this must not be opaque
        
        document = Cons.getStyledDocument();
        
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
                
                if (text.length() > 0)
                { 
                    CommandParsing.doCommand(text);
                    scrollBottom();
                    input.selectAll(); //highlights text when enter is pressed                    
                }
            }
        });        
        input.addKeyListener(new KeyListener()
        {
            @Override
            public void keyPressed(KeyEvent e){}
            @Override
            public void keyReleased(KeyEvent e){}
            @Override
            public void keyTyped(KeyEvent e){}
        });
    
        //scroll pane setup
        scrollpane = new JScrollPane(Cons);
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
Cons.setCaretPosition(0);
}

public void scrollBottom()
{
Cons.setCaretPosition(Cons.getDocument().getLength());
}

//print call
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


