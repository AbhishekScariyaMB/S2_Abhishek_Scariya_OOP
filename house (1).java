import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
 
public class house extends  Applet implements MouseListener,Runnable
{
	private Color textColor = Color.BLUE;
public void paint(Graphics g)
{ int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
g.drawRect(150, 150, 150, 200); //House
g.drawRect(200, 200, 50, 150); 
g.setColor(Color.blue);
g.setColor(textColor);
g.fillRect(200, 200, 50, 150); // Door
g.setColor(Color.black);
g.fillPolygon(x, y, 3); // Roof
}
public void init()
    {
        this.setSize(200,200);
        addMouseListener(this);
    }
    public void run()
    {
        while(true)
        {
            repaint();
            try 
            {
              Thread.sleep(17);  
            } 
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
    }
    public void mouseClicked(MouseEvent e)
    {
        int x=e.getX(),y=e.getY();
        if(x>=60 && x<=120 && y>=80 && y<=95)
            textColor=Color.BLUE;
        else
            textColor=Color.RED;
            repaint();
            System.out.println("Mouse Position: X= "+x+"Y"+y);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}