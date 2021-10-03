package prj;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class marks extends Applet implements ActionListener {
public int per =0;
Label l1 = new Label("enter Marks of Subject 1: ");
 Label l2 = new Label("enter Marks of Subject 2: ");
 Label l3 = new Label("enter Marks of Subject 3: ");
 Label l4 = new Label("enter Marks of Subject 4: ");
 Label l5 = new Label("enter Marks of Subject 5: ");
 Label l6 = new Label("Total Percentage: ");
 
 TextField t1 = new TextField(10);
 TextField t2 = new TextField(10);
 TextField t3 = new TextField(10);
 TextField t4 = new TextField(10);
 TextField t5 = new TextField(10);
 TextField t6 = new TextField(10);
 
 Button b1 = new Button("CALCULATE PERCENTAGE");
 
 public marks()
 {
 l1.setBounds(50, 100, 280, 20);
 l2.setBounds(50, 150, 280, 20);
 l3.setBounds(50, 200, 280, 20);
 l4.setBounds(50, 250, 280, 20);
 l5.setBounds(50, 300, 280, 20);
 l6.setBounds(50, 350, 280, 20);
 
 t1.setBounds(200, 100, 300, 20);
 t2.setBounds(200, 150, 300, 20);
 t3.setBounds(200, 200, 300, 20);
 t4.setBounds(200, 250, 300, 20);
 t5.setBounds(200, 300, 300, 20);
 t6.setBounds(200, 350, 300, 20);
 
 b1.setBounds(200,400, 200, 20);
 GridLayout g1 = new GridLayout(20, 2, 5, 5);
 setLayout(g1);
 add(l1);
 add(t1);
 add(l2);
 add(t2);
 add(l3);
 add(t3);
 add(l4);
 add(t4);
 add(l5);
 add(t5);
 add(l6);
 add(t6);
 add(b1); 
 b1.addActionListener(this);
 }
@Override
public void actionPerformed(ActionEvent e) {
// TODO Auto-generated method stub
int m1 = Integer.parseInt(t1.getText());
 int m2= Integer.parseInt(t2.getText());
 int m3= Integer.parseInt(t3.getText());
 int m4= Integer.parseInt(t4.getText());
 int m5= Integer.parseInt(t5.getText());
 
 if(e.getSource()==b1)
 {
 int add=m1+m2+m3+m4+m5;
 per=add/5;
 t6.setText(String.valueOf(per)+" %");
 
 repaint();
 }
 
}
public void paint(Graphics g)
 {
if(per>=50)
{
g.setColor(Color.yellow);
g.drawOval(80, 700, 150, 150);
g.fillOval(80, 700, 150, 150);
g.setColor(Color.BLACK);
g.fillOval(120, 740, 15, 15);
g.fillOval(170, 740, 15, 15);
g.drawArc(130, 800, 50, 20, 180, 180);
}
else if(per>0 && per<50)
{
g.setColor(Color.yellow);
g.drawOval(80, 700, 150, 150);
g.fillOval(80, 700, 150, 150);
 g.setColor(Color.BLACK);
 g.fillOval(120, 740, 15, 15);
 g.fillOval(170, 740, 15, 15);
g.drawArc(130,820,50,20,0,180);
}
 }
public static void main(String args[]) {
 new marks();
 }
 
}
