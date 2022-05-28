import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class add {

	public static void main(String[] args) {
		Adition a = new Adition();
	}

}
class Adition extends JFrame implements ActionListener{
	JTextField t1;
	JTextField t2;
	JButton b;
	JLabel L;
	public Adition(){
		t1=new JTextField(70);
		t2=new JTextField(70);
		b=new JButton("Add");
		L=new JLabel("result");
		add(t1);
		add(t2);
		add(b);
		add(L);
		b.addActionListener(this);
		setLayout(new SpringLayout());
		setVisible(true);
		setSize(750,700);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		int num1= Integer.parseInt(t1.getText());
		int num2= Integer.parseInt(t2.getText());
		int num3=num1+num2;
		L.setText(num3+"");
		
	}
}
