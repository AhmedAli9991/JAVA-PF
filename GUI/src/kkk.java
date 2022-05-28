import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class kkk {

	public static void main(String[] args) {
		abc xyz=new abc();
	}

}
class abc extends JFrame{
	JLabel R;
	public abc() {
		JLabel l1= new JLabel("Name");
		JTextField t1=new JTextField(70);
		JRadioButton r1=new JRadioButton("Male");
		JRadioButton r2=new JRadioButton("Female");
		JCheckBox b1= new JCheckBox("student");
		JCheckBox b2= new JCheckBox("working");
		JButton b = new JButton("Submit");
		R = new JLabel("");
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(l1);
		add(t1);
		add(r1);
		add(r2);
		add(b1);
		add(b2);
		add(b);
		add(R);
		b.addActionListener(e->
		{
			R.setText("Thank You");
		});
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
