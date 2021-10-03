import java.applet.*;
import java.awt.*;
import java.util.*;
public class colorchange extends Applet implements MouseListener,Runnable
{
    private Color textColor = Color.BLACK;
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.drawOval(20,20,140,140);
        g.setColor(Color.pink);
        g.fillOval(20,20,140,140);
        g.setColor(Color.black);
        g.setColor(textColor);
        g.setFont(new Font("Sanserif",Font.BOLD,25));
        g.drawString("JAVA",60,95);
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
            textColor=Color.RED;
        else
            textColor=Color.BLACK;
            repaint();
            System.out.println("Mouse Position: X= "+x+"Y"+y);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}
