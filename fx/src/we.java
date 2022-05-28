import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class we extends JFrame{
	JTextField name;
	JTextField reg;
	JTextField pass;
	JRadioButton std;
	JRadioButton prof;
	JRadioButton admin;
	JButton submit;
	public static void main(String[] args) {
		abc();
	}
	public static  void abc(){
		JLabel l1 = new JLabel("Name");
		JTextField name = new JTextField(70);
		JLabel l2 = new JLabel("registration number");
		JTextField reg = new JTextField(70);
		JLabel l3 = new JLabel("password");
		JTextField pass = new JTextField(70);
		JRadioButton std = new JRadioButton("Student");
		JRadioButton prof = new JRadioButton("Teacher");
		JRadioButton admin = new JRadioButton("Administration");
		JButton submit = new JButton("Submit");
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
