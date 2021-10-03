import java.awt.*;
import java.applet.*;
public class myline extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(100,10,250,150);
        g.drawOval(100, 100, 150, 100);
        g.drawRect(10,10,50,100);

    }
}