import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class windex extends Frame implements WindowListener
{
windex()
{
addWindowListener(this);
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
new windex();
}
public void windowActivated(WindowEvent arg0)
{
System.out.println("Window Activated");
}
public void windowClosed(WindowEvent arg0)
{
System.out.println("Window Closed");
}
public void windowClosing(WindowEvent arg0)
{
System.out.println("Window Closing");
}
public void windowDeactivated(WindowEvent arg0)
{
System.out.println("Window Deactivated");
}
public void windowDeiconified(WindowEvent arg0)
{
System.out.println("Window Deiconified");
}
public void windowIconified(WindowEvent arg0)
{
System.out.println("Window Iconified");
}
public void windowOpened(WindowEvent arg0)
{
System.out.println("Window Opened");
}
}