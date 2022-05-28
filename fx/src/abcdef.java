import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class abcdef {

	public static void main(String[] args) {
		form xy=new form();
	}
}
class form extends JFrame{
	JTextField name;
	JTextField reg;
	JPasswordField pass;
	JRadioButton std;
	JRadioButton prof;
	JRadioButton admin;
	JButton submit;
	public form(){
		JLabel l1 = new JLabel("Name");
		name = new JTextField(70);
		JLabel l2 = new JLabel("registration number");
		reg = new JTextField(70);
		JLabel l3 = new JLabel("password");
		pass = new JPasswordField(70);
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
		submit.addActionListener(e->{
			if(std.isSelected()) {
				student x = new student ();
				dispose();}
			else if(prof.isSelected()){
				teach x = new teach();
				dispose();}
			else if(admin.isSelected()) {
				admin x = new admin();
				dispose();}
		});
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class student extends JFrame{
	JButton Submit;
	public student() {
		JCheckBox b1= new JCheckBox("Pf");
		JCheckBox b2= new JCheckBox("dld");
		JCheckBox b3= new JCheckBox("rw");
		JCheckBox b4= new JCheckBox("eng");
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setVisible(true);
		setSize(750,700);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class teach extends JFrame{
	public teach() {
		
	}
}
class admin extends JFrame{
	public admin() {
		
	}
}