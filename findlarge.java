import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class findlarge extends Applet implements ActionListener
{
 TextField t1,t2,t3,t4;
 Button b1;
 public void init()
 {
     t1=new TextField(15);
     t1.setBounds(100,25,50,20);
     t2=new TextField(15);
     t2.setBounds(100,25,50,20);
     t3=new TextField(15);
     t3.setBounds(100,25,50,20);
     t4=new TextField("Ans");
     t4.setBounds(175,50,50,20);
     b1= new Button("Find");
     b1.setBounds(175,65,50,40);
     add(t1);
     add(t2);
     add(t3);
     add(t4);
     add(b1);
     b1.addActionListener(this);

 }
 public void actionPerformed(ActionEvent e)
 {
     int i,j,k;
     i=Integer.parseInt(t1.getText());
     j=Integer.parseInt(t2.getText());
     k=Integer.parseInt(t3.getText());
    if(i<j)
    {
        if(j<k)
        t4.setText(""+k);
        else
        t4.setText(""+j);
    }
    else
     t4.setText(""+i);
 }
}