import java.awt.*;
import java.awt.event.*;
public class choiceexamp
{
choiceexamp()
{
Frame f=new Frame();
final Label label=new Label();
label.setAlignment(Label.CENTER);
label.setSize(400,100);
Button b=new Button("show");
b.setBounds(200,100,50,20);

final Choice c=new Choice();

c.setBounds (100,100,75,75);
c.add("C");
c.add("C++");
c.add("Java");
c.add("PHP");
c.add("Android");

f.add(c);
f.add(label);
f.add(b);

f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);

b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
String data="Programming Lang selected: "+c.getItem(c.getSelectedIndex());
label.setText(data);
}
});
}

public static void main(String args[])
{
new choiceexamp();
}
}