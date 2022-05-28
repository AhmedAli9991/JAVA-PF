import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class EO {

	public static void main(String[] args) {
		E e = new E();
	}
}
class E extends JFrame implements ActionListener{
	JTextField num;
	JLabel ans;
	JButton B;
	public E(){
		num=new JTextField(65);
		ans=new JLabel("__");
		B=new JButton("check");
		add(num);
		add(B);
		add(ans);
		setVisible(true);
		setSize(700,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		B.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		int n=Integer.parseInt(num.getText());
		if(n%2==0)
			ans.setText("Even");
		else
			ans.setText("odd");
	}	
}