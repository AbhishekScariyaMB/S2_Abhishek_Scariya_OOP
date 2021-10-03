import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Car extends Applet implements MouseListener,Runnable
{
		// size of area needed for applet figure
	public final int FIGUREHEIGHT = 280;
	public final int FIGUREWIDTH  = 445;

		// color definitions (red, green, blue)
        Color REDBROWN = new Color ( 182, 100, 110 ) ;
        Color DARKBROWN = new Color ( 150, 70, 80 ) ;
        Color LTBLUE = new Color ( 35, 206, 255 ) ;
        Color DARKGOLD = new Color ( 240, 220, 0 ) ;
        private Color textColor = Color.BLUE;
		// Applets have a paint method
	public void paint (Graphics myCar)
			// all paint methods require a Graphics parameter)
	{
			// background for figure
                myCar.setColor ( Color.white ) ;
                myCar.fillRect ( 0, 0, FIGUREWIDTH, FIGUREHEIGHT ) ;

			// front tire
                myCar.setColor ( Color.black ) ;
  		myCar.fillOval ( 20, 170, 100, 100 ) ;
                myCar.setColor ( Color.white ) ;
  		myCar.fillOval ( 30, 180, 80, 80 ) ;
                myCar.setColor ( Color.black ) ;
  		myCar.drawOval ( 40, 190, 60, 60 ) ;

			// back tire
                myCar.setColor ( Color.black ) ;
  		myCar.fillOval ( 270, 170, 100, 100 ) ;
                myCar.setColor ( Color.white ) ;
  		myCar.fillOval ( 280, 180, 80, 80 ) ;
                myCar.setColor ( Color.black ) ;
  		myCar.drawOval ( 290, 190, 60, 60 ) ;

			// car hood
                myCar.setColor ( DARKBROWN ) ;
  		myCar.fillRect ( 10, 113, 122, 12 ) ;
                myCar.setColor ( REDBROWN ) ;
  		myCar.fillRect ( 10, 123, 122, 82 ) ;

			// car hood ornament
                myCar.setColor ( DARKGOLD ) ;
  		myCar.fillOval ( 10, 105, 10, 10 ) ;

			//  car window
                myCar.setColor ( LTBLUE ) ;
                myCar.fillRect ( 130, 15, 130, 100 ) ; 

			// car door
                myCar.setColor ( Color.BLUE ) ;
                myCar.setColor (textColor);
  		myCar.fillRect ( 130, 113, 130, 92 ) ;

			// car backseat
                myCar.setColor ( REDBROWN ) ;
  		myCar.fillRect ( 258, 15, 122, 190 ) ;

			// car trunk
                myCar.setColor ( REDBROWN ) ;
  		myCar.fillRect ( 378, 80, 57, 125 ) ;

			// car running board
                myCar.setColor ( DARKBROWN ) ;
  		myCar.fillRect ( 118, 205, 154, 10 ) ;

			// visor
                myCar.setColor ( Color.black ) ;
		myCar.drawLine ( 131, 15, 110, 30) ;
		myCar.drawLine ( 131, 16, 110, 31) ;
		myCar.drawLine ( 131, 17, 110, 32) ;

			// door handle
                myCar.setColor ( Color.black ) ;
		myCar.drawLine ( 145, 125, 170, 125) ;
		myCar.drawLine ( 145, 124, 170, 124) ;
		myCar.drawLine ( 145, 123, 170, 123) ;
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
            textColor=Color.GREEN;
            repaint();
            System.out.println("Mouse Position: X= "+x+"Y"+y);
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
}