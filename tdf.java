import java.awt.*;
import java.applet.*;

import java.awt.event.*;

public class tdf extends  Applet implements MouseListener{ 

    public void paint(Graphics g)
    {
        
        g.setColor(Color.black);
        g.drawRect(150,150,50,150);
        g.drawRect(150,150,50,150);
        g.setColor(Color.black);
        g.fillRect(150,150,50,150);
        g.drawRect(150,150,50,150);
        g.setColor(Color.black);
        g.fillRect(165,300,20,155);
        g.drawRect(165,300,20,155);
        g.setColor(Color.red);
        g.fillOval(150,150,50,50);
        g.setColor(Color.yellow);
        g.fillOval(150,200,50,50);
        g.setColor(Color.green);
        g.fillOval(150,250,50,50);
        addMouseListener(this);
        }

        public void run()
        {
            while(true)
            {
                 repaint();
                try{
                    Thread.sleep(17);
            
                } catch(InterruptedException e) {
                e.printStackTrace();
                }
            }
        }
         public void mouseClicked(MouseEvent e)
        {
        Graphics g=getGraphics();
        g.setColor(Color.green);
        g.fillOval(150,150,50,50);
        g.setColor(Color.red);
        g.fillOval(150,200,50,50);
        g.setColor(Color.yellow);
        g.fillOval(150,250,50,50);
        } 
       
    
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}


}