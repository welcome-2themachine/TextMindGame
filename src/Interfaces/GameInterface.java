/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Brian
 */
public class GameInterface extends JPanel implements ActionListener{
    protected JTextArea textArea;
    protected JTextField textField;
    private final static String newline = "\n";
   
    public GameInterface(){
    super(new GridBagLayout());
    
    textArea = new JTextArea (30, 60);
    textArea.setEditable(false);
    JScrollPane scrollPane = new JScrollPane(textArea);
    
    textField = new JTextField(40);
    textField.addActionListener(this);
    
    //adding components
    GridBagConstraints c = new GridBagConstraints();
    c.gridwidth = GridBagConstraints.REMAINDER;
    
    c.fill = GridBagConstraints.BOTH;
    c.weightx = 1.0;
    c.weighty = 1.0;
    add(scrollPane, c);
    
    c.fill = GridBagConstraints.HORIZONTAL;
    add(textField, c);
    }
    
    public void actionPerformed(ActionEvent evt){
        String text = textField.getText();
        textArea.append(text + newline);
        textField.selectAll();
        textArea.setCaretPosition(textArea.getDocument().getLength());  
    }
    
    public void print(String text){
        textArea.append(text + newline);
    }
 
    public static void createAndShowGUI(){
        //the window
        JFrame frame = new JFrame("GameInterface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //adding stuff to window
        frame.add(new GameInterface());
        
        //show window
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
    }
