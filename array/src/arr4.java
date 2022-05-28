import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class arr4 {

	public static void main(String[] args) {
		abc x=new abc();
	}
}
class abc extends JFrame{
	public abc () {
		String x = JOptionPane.showInputDialog("how many numbers you wish to add");
		int  y = Integer.parseInt(x);
		int arr[]=new int[y];
		for(int i:arr) {
			JTextField a = new JTextField(70);
			add(a);
		}
		
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

