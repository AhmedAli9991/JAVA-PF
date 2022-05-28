import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class asd {

	public static void main(String[] args) {
		a b=new a();
	}
}
class a extends JFrame{
	int i=0;
	JTextField n1;
	JTextField n2;
	JButton b;
	JLabel L;
	public a() {

		n1 = new JTextField(70);
		n2 = new JTextField(70);
		JLabel L1 = new JLabel("wight in KGs");
		JLabel L2 = new JLabel("height in meters");
		JButton b = new JButton("calulate");
		L = new JLabel("Result");
		JLabel L3 = new JLabel("Gender");
		JRadioButton r1= new JRadioButton("MALE");
		JRadioButton r2= new JRadioButton("FEMALE");
		JCheckBox b1 = new JCheckBox("asdf");
		JCheckBox b2 = new JCheckBox("asdf");
		ButtonGroup bg = new ButtonGroup(); 
		bg.add(r1);
		bg.add(r2);
		
		
		add(L1);
		add(n1);
		add(L2);
		add(n2);
		add(L3);
		add(r1);
		add(r2);
		add(b1);
		add(b2);
		add(b);
		add(L);
		
		r1.addItemListener(e->{
			i=0;
		});
		r2.addItemListener(e->{
			i=-5;
		});
		b.addActionListener(l->{
			int W = Integer.parseInt(n1.getText()); 
			double h = Double.parseDouble(n2.getText());
			double BMI = (W/(h*h))+i;		 
			if(BMI>30) 
				L.setText(BMI+"You are obesee");
			else if (BMI>25)
				L.setText(BMI+"You are over weight");
			else if (BMI<=25 & BMI>=18.5) 
				L.setText(BMI+"You are healthy");
			else 
				L.setText(BMI+"You are underweight");	
		});
		
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
