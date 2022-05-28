import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class abcdef {

	public static void main(String[] args) {
		abc xy=new abc();
	}
}
class abc extends JFrame{
	JTextField name;
	JTextField reg;
	JTextField pass;
	JRadioButton std;
	JRadioButton prof;
	JRadioButton admin;
	JButton submit;
	public abc(){
		JLabel l1 = new JLabel("Name");
		name = new JTextField(70);
		JLabel l2 = new JLabel("registration number");
		reg = new JTextField(70);
		JLabel l3 = new JLabel("password");
		pass = new JTextField(70);
		std = new JRadioButton("Student");
		prof = new JRadioButton("Teacher");
		admin = new JRadioButton("Administration");
		submit = new JButton("Submit");
		ButtonGroup bg = new ButtonGroup();
		bg.add(std);
		bg.add(prof);
		bg.add(admin);
		add(l1);
		add(name);
		add(l2);
		add(reg);
		add(l3);
		add(pass);
		add(std);
		add(prof);
		add(admin);
		add(submit);
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}