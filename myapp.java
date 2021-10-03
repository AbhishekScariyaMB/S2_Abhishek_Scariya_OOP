import java.awt.*;
import java.applet.*;
import java.util.*;
public class myapp extends Applet
{
    public void init()
    {
        System.out.println("Initialized");
    }
    public void start()
    {
        System.out.println("Started");
    }
    public void stop()
    {
        System.out.println("Stopped");
    }
    public void paint(Graphics g)
    {
        System.out.println("Painting");
    }
    public void destroy()
    {
        System.out.println("destroyed");
    }
}