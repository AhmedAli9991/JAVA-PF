import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Bmi {

	public static void main(String[] args) {
		cal n = new cal();
	}

}
class cal extends JFrame implements ActionListener{
	JTextField n1;
	JTextField n2;
	JButton b;
	JLabel L;
	public cal() {
		n1 = new JTextField(70);
		n2 = new JTextField(70);
		JLabel L1 = new JLabel("wight in KGs");
		JLabel L2 = new JLabel("height in meters");
		b = new JButton("calulate");
		L = new JLabel("Result");
		add(L1);
		add(n1);
		add(L2);
		add(n2);
		add(b);
		add(L);
		b.addActionListener(this);
		setVisible(true);
		setSize(750,750);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.BLUE);
	}
	
	public void actionPerformed(ActionEvent e) {
		int W = Integer.parseInt(n1.getText()); 
		double h = Double.parseDouble(n2.getText());
		double BMI = W/(h*h);		 
		if(BMI>30) 
			L.setText(BMI+"You are obesee");
		else if (BMI>25)
			L.setText(BMI+"You are over weight");
		else if (BMI<=25 & BMI>=18.5) 
			L.setText(BMI+"You are healthy");
		else 
			L.setText(BMI+"You are underweight");	
	}
}