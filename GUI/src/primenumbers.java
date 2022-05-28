import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class primenumbers {

	public static void main(String[] args) {
		prime p = new prime();
	}
}
class prime extends JFrame implements ActionListener{
	JTextField num;
	JButton B;
	JLabel L;
	public prime() {
		num=new JTextField(70);
		B=new JButton("Check");
		L=new JLabel("result");
		add(num);
		add(B);
		add(L);
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		B.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n = Integer.parseInt(num.getText());
		int i;
		for(i=2;i<=n;i++) {
			if(n%i==0)
				break;		
			}
		if(i==n)
			L.setText(n+"is a prime number");
		else
			L.setText(n+"is not a prime number");
	}
}