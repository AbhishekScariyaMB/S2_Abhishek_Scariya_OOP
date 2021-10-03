import java.io.*;
import java.awt.*;
import java.awt.Color.*;
import java.awt.event.*;
import java.applet.*;




public class train2 extends Applet implements 
ActionListener,ItemListener

{
	Label name,amount,seats,number;
	TextField na,am,sts,nr;
	TextArea t;
	Choice css;
	private java.awt.Image image1;


	Checkbox si,sr;
	CheckboxGroup g;

	Button b,cancel;
	int s,c,d;
	int n1=400;
	int n2=250;
	int n3=100;

	public void init()
	{
		image1=getImage(getDocumentBase(),"train.jfif");
		setForeground(Color.red);
		setLayout(new FlowLayout());

		na=new TextField(20);
		am=new TextField(20);
		sts=new TextField(20);
		nr=new TextField(20);


		name=new Label("NAME");
		amount=new Label("AMOUNT");
		seats=new Label("SEATS");
		number=new Label("REQUIRED NO OF SEATS");

		css=new Choice();
		css.add("A.C SLEEPER");
		css.add("FIRST CLASS");
		css.add("SECOND CLASS");

		t=new TextArea(40,45);

		g=new CheckboxGroup();
		si=new Checkbox("SATAPTI",g,false);
		sr=new Checkbox("SABARI",g,false);

		b=new Button("SUBMIT");
		cancel=new Button("CANCEL");

		add(name);
		add(na);

		add(seats);
		add(sts);

		add(number);
		add(nr);


		add(si);
		add(sr);

		add(css);

		add(b);

		add(amount);
		add(am);

		add(t);
		add(cancel);

		css.addItemListener(this);
		b.addActionListener(this);
		si.addItemListener (this);
		sr.addItemListener (this);


	}
	public void paint(Graphics g){
        g.drawImage(image1,0,0,this);
      }

	public void actionPerformed(ActionEvent ae)
	{

		if(b.getActionCommand().equals("SUBMIT"))
		{
			d=Integer.parseInt(nr.getText());
			s=(Integer.parseInt(sts.getText()))-d;

			if(css.getSelectedItem().equals("A.C SLEEPER"))
				{
					am.setText("400");
				}
			else if(css.getSelectedItem().equals("FIRST CLASS"))
				{
					am.setText("250");
				}
			else
				{
					am.setText("100");
				}

		}

			
c=((Integer.parseInt(am.getText()))*(Integer.parseInt(nr.getText())));
			t.setText("NAME:"+na.getText()+"After reservation total no.of seats are:"+s+"Train name:"+g.getSelectedCheckbox().getLabel()+"Class:"+css.getSelectedItem()+"Total number of Rs:"+c);

			if(cancel.getActionCommand().equals("CANCEL"))
			{
				repaint();
		}

	}

        public void itemStateChanged(ItemEvent ie)
        {

        }

}