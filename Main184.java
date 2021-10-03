import java.awt.*;
import java.applet.*;
 
public class Main184 extends Applet
{
public void paint(Graphics gp)
{ int [] x = {150, 300, 225};
int [] y = {150, 150, 25};
gp.drawRect(150, 150, 150, 200);
gp.drawRect(200, 200, 50, 150);
gp.drawOval(200, 75, 50, 50);
gp.drawPolygon(x, y, 3);
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