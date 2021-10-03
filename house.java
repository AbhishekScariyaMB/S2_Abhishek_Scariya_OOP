import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class house extends Applet implements MouseListener, Runnable {
	private Color doorColor = Color.WHITE;

	public void paint(Graphics gp) {
		int[] i = { 150, 300, 225 };
		int[] j = { 150, 150, 25 };
		gp.drawRect(150, 150, 150, 200);
		gp.drawOval(200, 75, 50, 50);
		gp.drawPolygon(i, j, 3);		
		gp.setColor(doorColor);
		gp.fillRect(200, 200, 50, 150);
		gp.setColor(Color.BLACK);
		gp.drawRect(200, 200, 50, 150);
	}

	public void init() {
		this.setSize(200, 200);
		addMouseListener(this);
	}

	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		if (x >= 200 && x <= 250 && y >= 200 && y <= 350)
			doorColor = Color.RED;
		else
			doorColor = Color.BLUE;
		repaint();
		System.out.println("Mouse Position : X=" + x + " Y=" + y + "");

	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}