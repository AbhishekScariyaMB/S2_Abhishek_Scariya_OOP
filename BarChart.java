import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
public class BarChart extends JApplet
{
   public void init()
   {
      EventQueue.invokeLater(new Runnable()
         {
            public void run()
            {
               String v = getParameter("values");
               if (v == null) return;
               int n = Integer.parseInt(v);
               double[] values = new double[n];
               String[] names = new String[n];
               for (int i = 0; i < n; i++)
               {
                  values[i] = Double.parseDouble(getParameter("value." + (i + 1)));
                  names[i] = getParameter("name." + (i + 1));
               }
               add(new Component(values, names, getParameter("title")));
            }
         });
   }
}
class Component extends JComponent
{
   public Component(double[] v, String[] n, String t)
   {
      values = v;
      names = n;
      title = t;
   }
   public void paintComponent(Graphics g)
   {
       // variables to store the number of students in each discipline
		// and the total number of students
		int Sci, Soc, Hum, Total;
		
		// variables to store percentages should be float
		float PercSci, PercSoc, PercHum;
		
		// the coordinates and size of the pie is fixed below
		int x = 50, y = 50, w = 100, h = 100;
		
		// these quantities will need to be computed for each slice
		int startAngle = 0, degrees;
		
		// Set # of students in each discipline
		Sci = 5;
		Soc = 6;
		Hum = 7;
		
		// Computer percentages
		Total = Sci + Soc + Hum;
		
		PercSci = Sci * 100.0f / Total;
		PercSoc = Soc * 100.0f / Total;
		PercHum = Hum * 100.0f / Total;
	
		// Print out results for checking
		System.out.println("Total = " + Total);
		System.out.println("%Sci = " + PercSci);
		System.out.println("%Soc = " + PercSoc);
		System.out.println("%Hum = " + PercHum);
		
		// Display the Pie Chart
		// Display the Pie for Sciences
		degrees = (int) (PercSci*360/100);
		g.setColor(Color.red);
		g.fillArc(x, y, w, h, startAngle, degrees);
		
		// Pie for Soc
		startAngle = degrees;
		degrees = (int) (PercSoc*360/100);
		g.setColor(Color.yellow);
		g.fillArc(x, y, w, h, startAngle, degrees);
		
		// Pie for Hum
		startAngle = startAngle + degrees;
		degrees = (int) (PercHum*360/100);
		g.setColor(Color.green);
		g.fillArc(x, y, w, h, startAngle, degrees);
      Graphics2D g2 = (Graphics2D) g;
      if (values == null) return;
      double minValue = 0;
      double maxValue = 0;
      for (double v : values)
      {
         if (minValue > v) minValue = v;
         if (maxValue < v) maxValue = v;
      }
      if (maxValue == minValue) return;
      int panelWidth = getWidth();
      int panelHeight = getHeight();
      Font titleFont = new Font("SansSerif", Font.BOLD, 20);
      Font labelFont = new Font("SansSerif", Font.PLAIN, 10);
      FontRenderContext context = g2.getFontRenderContext();
      Rectangle2D titleBounds = titleFont.getStringBounds(title, context);
      double titleWidth = titleBounds.getWidth();
      double top = titleBounds.getHeight();
      double y = -titleBounds.getY(); 
      double x = (panelWidth - titleWidth) / 2;
      g2.setFont(titleFont);
      g2.drawString(title, (float) x, (float) y);
      LineMetrics labelMetrics = labelFont.getLineMetrics("", context);
      double bottom = labelMetrics.getHeight();
      y = panelHeight - labelMetrics.getDescent();
      g2.setFont(labelFont);
      double scale = (panelHeight - top - bottom) / (maxValue - minValue);
      int barWidth = panelWidth / values.length;
      for (int i = 0; i < values.length; i++)
      {
         double x1 = i * barWidth + 1;
         double y1 = top;
         double height = values[i] * scale;
         if (values[i] >= 0) y1 += (maxValue - values[i]) * scale;
         else
         {
            y1 += maxValue * scale;
            height = -height;
         }
         Rectangle2D rect = new Rectangle2D.Double(x1, y1, barWidth - 2, height);
         g2.setPaint(Color.BLUE);
         g2.fill(rect);
         g2.setPaint(Color.BLACK);
         g2.draw(rect);
         Rectangle2D labelBounds = labelFont.getStringBounds(names[i], context);
         double labelWidth = labelBounds.getWidth();
         x = x1 + (barWidth - labelWidth) / 2;
         g2.drawString(names[i], (float) x, (float) y);
      }
   }
   private double[] values;
   private String[] names;
   private String title;
}