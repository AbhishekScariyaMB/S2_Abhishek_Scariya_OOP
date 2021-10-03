import java.awt.*;
import java.awt.event.*;
public class choiceshape
{
choiceshape()
{
Frame f=new Frame();
String data;
final Label label=new Label();
label.setAlignment(Label.CENTER);
label.setSize(400,100);
Button b=new Button("show");
b.setBounds(200,100,50,20);

final Choice c=new Choice();

c.setBounds (100,100,75,75);
c.add("Circle");
c.add("Square");
c.add("Rectangle");
c.add("Triangle");

f.add(c);
f.add(label);
f.add(b);

f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);

b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String data="Selected: "+c.getItem(c.getSelectedIndex());
label.setText(data);
}
});
public void paint(Graphics g)
{
    String data2 = label.getText();
if(data2=="Circle")
{
  
        g.drawString("Circle",275,100);
       g.drawRect(400,50,200,100);
   
}
else if(data2=="Rectangle")
{
    
         g.drawString("Rectangle",275,100);
         g.drawRect(100, 100, 200, 200);
  
}
else if(data2=="Triangle")
{
   
         g.drawString("Triangle",275,100);
         g.drawLine(180,150,180,370);
         g.drawLine(180,150,440,370);
         g.drawLine(180,370,440,370);
    
}
else if(data2=="Square")
{
   
         g.drawString("Square",275,100);
         g.drawRect(100,100,50,50);
   
}
else
{
   
         g.drawString("Invalid",275,100);
    
}
}
}
public static void main(String args[])
{
new choiceshape();
}
}
