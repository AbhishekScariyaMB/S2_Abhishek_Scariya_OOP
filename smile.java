import java.awt.*;
import java.applet.*;
public class smile extends Applet
{
    public void paint(Graphics g )
    {
        g.drawOval(80,70,150,150);
        g.setColor(Color.BLACK);
        g.fillOval(120,120,15,15);
        g.fillOval(170,170,15,15);
        g.drawArc(130,180,50,20,180,50);

    }
}