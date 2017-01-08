/*
 * Compliment authors RJHM van den Bergh , rvdb@comweb.nl, and David MacDermot for the console code.
 */
package Interfaces;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.InputStream;
import java.io.IOException;

/**
 *
 * @author Brian
 */
public class CustomConsole extends WindowAdapter implements Runnable, WindowListener, ActionListener{
    
    private JFrame window;
    private JTextArea textArea; 
    private JTextArea inputArea;
    private Thread reader;
    private final PipedInputStream pin=new PipedInputStream();
    private final PipedOutputStream pout=new PipedOutputStream();
    private boolean quit;
    
    public CustomConsole() {
        //Making the screen and sizing it.
        int x=800;
        int y=400;
        window = new JFrame("TextGame"); //name the window
        Dimension frameSize=new Dimension(x,y); //set dimensions of window
        window.setBounds(x,y,frameSize.width,frameSize.height);
        
        //describing the text area
        textArea = new JTextArea();
        textArea.setBackground(Color.black);
        textArea.setForeground(Color.white);
        textArea.setFont(new Font("Lucida Console", Font.BOLD, 14)); //DWM 02-07-2012
        textArea.setLineWrap(true); //DWM 02-07-2012
        textArea.setWrapStyleWord(true); //DWM 02-07-2012
        textArea.setEditable(true); //DWM 02-07-2012
        textArea.setCaret(new BlockCaret()); //compliments DWM
        textArea.setCaretColor(textArea.getForeground()); //a button was remove after this line
        
        //setting window pane and scroll bar
        window.getContentPane().setLayout(new BorderLayout());
        window.getContentPane().add(new JScrollPane(textArea),BorderLayout.CENTER); //after this line would be where to describe where buttons go
        window.setVisible(true);
        
        //of course, we need the listener
        window.addWindowListener(this);
        
        //redirecting system.out to PrintStream and error catching
        try {
                PipedOutputStream pout=new PipedOutputStream(this.pin);
                System.setOut(new PrintStream(pout,true)); 
        } 
        catch(java.io.IOException io){
            textArea.append("Failed to redirect system.out");
        }
        
        //redirecting in and error catching
        try {
                System.setIn(new PipedInputStream(this.pout));
        } 
        catch (java.io.IOException io) {
                textArea.append("Couldn't redirect STDIN to this console\n"+io.getMessage());
        }
        
        textArea.addKeyListener(new KeyListener() {

        //do we recognize a keypress?
        public void keyPressed(KeyEvent e) {}
        public void keyReleased(KeyEvent e) {}
        public void keyTyped(KeyEvent e)  {
            try { 
                pout.write(e.getKeyChar()); 
            } 
            catch (IOException ex) {}
        }});
        
        quit=false;
        
        // used from original, but second thread removed. We only need a single thread.				
        reader=new Thread(this);
        reader.setDaemon(true);	
        reader.start();	
 
    }
    
    private String readLine(PipedInputStream in) throws IOException {
        String input = "";
        
        //an ingenious, if not complex, way to mimic a console. We need to remember to compliment these fellows.
        do{
                int available=in.available();
                if (available==0) break;
                byte b[]=new byte[available];
                in.read(b);
                input=input+new String(b,0,b.length);														
        }while( !input.endsWith("\n") &&  !input.endsWith("\r\n") && !quit);
        return input;
    }
    
    

public synchronized void run(){
    while (Thread.currentThread()==reader){
            try {
                try { this.wait(100);}catch(InterruptedException ie) {}
                if (pin.available()!=0)
                {
                    String input=this.readLine(pin);
                    textArea.append(input);
                    textArea.setCaretPosition(textArea.getDocument().getLength()); //DWM 02-07-2012
                }
                if (quit) return;


            }catch(IOException ex) {textArea.append("Error in Run Function");}


    }

}

public synchronized void actionPerformed(ActionEvent evt){
this.clear();
}

public synchronized void clear(){
    textArea.setText("");
}

public synchronized void windowClosed(WindowEvent evt){
    quit=true;
    this.notifyAll(); // stop all threads
    try { reader.join(1000);pin.close();   } catch (Exception e){}		
    try { pout.close(); } catch (Exception e){} //DWM 02-07-2012
    System.exit(0);
}

public synchronized void windowClosing(WindowEvent evt){
    window.setVisible(false); // default behaviour of JFrame	
    window.dispose();
}
    
    
public Color getBackground() { //DWM 02-07-2012
		return textArea.getBackground();
	}

public void setBackground(Color bg) { //DWM 02-07-2012
        this.textArea.setBackground(bg);
}	

public Color getForeground() { //DWM 02-07-2012
        return textArea.getForeground();
}

public void setForeground(Color fg) { //DWM 02-07-2012
        this.textArea.setForeground(fg);
        this.textArea.setCaretColor(fg);
}

public Font getFont() { //DWM 02-07-2012
        return textArea.getFont();
}

public void setFont(Font f) { //DWM 02-07-2012
        textArea.setFont(f);
}

public void setWindowIcon(Window window){
    try
{
    InputStream imageInputStream = window.getClass().getResourceAsStream("src/DocHound.png");
    BufferedImage bufferedImage = ImageIO.read(imageInputStream);
    window.setIconImage(bufferedImage);
} catch (IOException exception)
{
    exception.printStackTrace();
}
}
    
    
}
